// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadBitcodeToMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UploadBitcodeToMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UploadBitcodeToMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadBitcodeToMsaResponseBody self = new UploadBitcodeToMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadBitcodeToMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadBitcodeToMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadBitcodeToMsaResponseBody setResultContent(UploadBitcodeToMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UploadBitcodeToMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public UploadBitcodeToMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UploadBitcodeToMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static UploadBitcodeToMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UploadBitcodeToMsaResponseBodyResultContent self = new UploadBitcodeToMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UploadBitcodeToMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UploadBitcodeToMsaResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UploadBitcodeToMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UploadBitcodeToMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
