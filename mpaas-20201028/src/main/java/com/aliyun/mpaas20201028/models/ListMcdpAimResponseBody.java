// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcdpAimResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListMcdpAimResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcdpAimResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimResponseBody self = new ListMcdpAimResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcdpAimResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcdpAimResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcdpAimResponseBody setResultContent(ListMcdpAimResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListMcdpAimResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListMcdpAimResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcdpAimResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcdpAimResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMcdpAimResponseBodyResultContent self = new ListMcdpAimResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListMcdpAimResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMcdpAimResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListMcdpAimResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMcdpAimResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
