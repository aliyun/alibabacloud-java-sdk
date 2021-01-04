// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("SmsSendDetailDTOs")
    public QuerySendDetailsResponseBodySmsSendDetailDTOs smsSendDetailDTOs;

    public static QuerySendDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsResponseBody self = new QuerySendDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public QuerySendDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySendDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySendDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySendDetailsResponseBody setSmsSendDetailDTOs(QuerySendDetailsResponseBodySmsSendDetailDTOs smsSendDetailDTOs) {
        this.smsSendDetailDTOs = smsSendDetailDTOs;
        return this;
    }
    public QuerySendDetailsResponseBodySmsSendDetailDTOs getSmsSendDetailDTOs() {
        return this.smsSendDetailDTOs;
    }

    public static class QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("ReceiveDate")
        public String receiveDate;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("PhoneNum")
        public String phoneNum;

        @NameInMap("Content")
        public String content;

        @NameInMap("SendStatus")
        public Long sendStatus;

        public static QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO self = new QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

    }

    public static class QuerySendDetailsResponseBodySmsSendDetailDTOs extends TeaModel {
        @NameInMap("SmsSendDetailDTO")
        public java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> smsSendDetailDTO;

        public static QuerySendDetailsResponseBodySmsSendDetailDTOs build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseBodySmsSendDetailDTOs self = new QuerySendDetailsResponseBodySmsSendDetailDTOs();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOs setSmsSendDetailDTO(java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> smsSendDetailDTO) {
            this.smsSendDetailDTO = smsSendDetailDTO;
            return this;
        }
        public java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> getSmsSendDetailDTO() {
            return this.smsSendDetailDTO;
        }

    }

}
