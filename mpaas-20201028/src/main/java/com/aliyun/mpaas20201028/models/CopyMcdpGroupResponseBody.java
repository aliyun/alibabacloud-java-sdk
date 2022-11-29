// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CopyMcdpGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CopyMcdpGroupResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CopyMcdpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyMcdpGroupResponseBody self = new CopyMcdpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyMcdpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyMcdpGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CopyMcdpGroupResponseBody setResultContent(CopyMcdpGroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CopyMcdpGroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CopyMcdpGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CopyMcdpGroupResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CopyMcdpGroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CopyMcdpGroupResponseBodyResultContent self = new CopyMcdpGroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CopyMcdpGroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CopyMcdpGroupResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CopyMcdpGroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CopyMcdpGroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
