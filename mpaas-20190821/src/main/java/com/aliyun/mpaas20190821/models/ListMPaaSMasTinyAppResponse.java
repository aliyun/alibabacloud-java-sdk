// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMPaaSMasTinyAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public ListMPaaSMasTinyAppResponseResultContent resultContent;

    public static ListMPaaSMasTinyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMPaaSMasTinyAppResponse self = new ListMPaaSMasTinyAppResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMPaaSMasTinyAppResponseResultContent extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Long code;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        public static ListMPaaSMasTinyAppResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMPaaSMasTinyAppResponseResultContent self = new ListMPaaSMasTinyAppResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
