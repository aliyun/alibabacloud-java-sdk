// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("SmsSendDetailDTOs")
    @Validation(required = true)
    public QuerySendDetailsResponseSmsSendDetailDTOs smsSendDetailDTOs;

    public static QuerySendDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsResponse self = new QuerySendDetailsResponse();
        return TeaModel.build(map, self);
    }

    public static class QuerySendDetailsResponseSmsSendDetailDTOsSmsSendDetailDTO extends TeaModel {
        @NameInMap("PhoneNum")
        @Validation(required = true)
        public String phoneNum;

        @NameInMap("SendStatus")
        @Validation(required = true)
        public Long sendStatus;

        @NameInMap("ErrCode")
        @Validation(required = true)
        public String errCode;

        @NameInMap("TemplateCode")
        @Validation(required = true)
        public String templateCode;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("SendDate")
        @Validation(required = true)
        public String sendDate;

        @NameInMap("ReceiveDate")
        @Validation(required = true)
        public String receiveDate;

        @NameInMap("OutId")
        @Validation(required = true)
        public String outId;

        public static QuerySendDetailsResponseSmsSendDetailDTOsSmsSendDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseSmsSendDetailDTOsSmsSendDetailDTO self = new QuerySendDetailsResponseSmsSendDetailDTOsSmsSendDetailDTO();
            return TeaModel.build(map, self);
        }

    }

    public static class QuerySendDetailsResponseSmsSendDetailDTOs extends TeaModel {
        @NameInMap("SmsSendDetailDTO")
        @Validation(required = true)
        public java.util.List<QuerySendDetailsResponseSmsSendDetailDTOsSmsSendDetailDTO> smsSendDetailDTO;

        public static QuerySendDetailsResponseSmsSendDetailDTOs build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseSmsSendDetailDTOs self = new QuerySendDetailsResponseSmsSendDetailDTOs();
            return TeaModel.build(map, self);
        }

    }

}
