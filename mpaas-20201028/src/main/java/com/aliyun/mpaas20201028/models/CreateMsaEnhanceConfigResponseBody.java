// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMsaEnhanceConfigResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMsaEnhanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceConfigResponseBody self = new CreateMsaEnhanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMsaEnhanceConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMsaEnhanceConfigResponseBody setResultContent(CreateMsaEnhanceConfigResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMsaEnhanceConfigResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMsaEnhanceConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMsaEnhanceConfigResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMsaEnhanceConfigResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMsaEnhanceConfigResponseBodyResultContent self = new CreateMsaEnhanceConfigResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMsaEnhanceConfigResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateMsaEnhanceConfigResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMsaEnhanceConfigResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateMsaEnhanceConfigResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
