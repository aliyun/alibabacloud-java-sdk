// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckOrganizationDomainResponseBody extends TeaModel {
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
    public CheckOrganizationDomainResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckOrganizationDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationDomainResponseBody self = new CheckOrganizationDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckOrganizationDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckOrganizationDomainResponseBody setResult(CheckOrganizationDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckOrganizationDomainResponseBodyResult getResult() {
        return this.result;
    }

    public CheckOrganizationDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckOrganizationDomainResponseBodyResult extends TeaModel {
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

        public static CheckOrganizationDomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckOrganizationDomainResponseBodyResult self = new CheckOrganizationDomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckOrganizationDomainResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckOrganizationDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CheckOrganizationDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
