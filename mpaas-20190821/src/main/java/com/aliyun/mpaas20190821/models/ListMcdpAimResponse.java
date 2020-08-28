// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcdpAimResponse extends TeaModel {
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
    public ListMcdpAimResponseResultContent resultContent;

    public static ListMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimResponse self = new ListMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMcdpAimResponseResultContent extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ListMcdpAimResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMcdpAimResponseResultContent self = new ListMcdpAimResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
