// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadBitcodeToMsaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UploadBitcodeToMsaResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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
