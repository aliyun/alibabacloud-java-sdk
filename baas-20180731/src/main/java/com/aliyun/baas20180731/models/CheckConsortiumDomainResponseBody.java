// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckConsortiumDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>CD264CC8-B892-4CDC-BD31-7D179EE6E396</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckConsortiumDomainResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckConsortiumDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConsortiumDomainResponseBody self = new CheckConsortiumDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConsortiumDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckConsortiumDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConsortiumDomainResponseBody setResult(CheckConsortiumDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckConsortiumDomainResponseBodyResult getResult() {
        return this.result;
    }

    public CheckConsortiumDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckConsortiumDomainResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bank</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Valid")
        public Boolean valid;

        public static CheckConsortiumDomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckConsortiumDomainResponseBodyResult self = new CheckConsortiumDomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckConsortiumDomainResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckConsortiumDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CheckConsortiumDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
