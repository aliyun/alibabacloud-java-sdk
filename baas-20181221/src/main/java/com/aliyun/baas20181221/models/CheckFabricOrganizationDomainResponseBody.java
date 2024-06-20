// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricOrganizationDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>C30A14C7-800E-468B-9EB2-C704DA49295E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckFabricOrganizationDomainResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckFabricOrganizationDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricOrganizationDomainResponseBody self = new CheckFabricOrganizationDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFabricOrganizationDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckFabricOrganizationDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFabricOrganizationDomainResponseBody setResult(CheckFabricOrganizationDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckFabricOrganizationDomainResponseBodyResult getResult() {
        return this.result;
    }

    public CheckFabricOrganizationDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckFabricOrganizationDomainResponseBodyResult extends TeaModel {
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

        public static CheckFabricOrganizationDomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckFabricOrganizationDomainResponseBodyResult self = new CheckFabricOrganizationDomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckFabricOrganizationDomainResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckFabricOrganizationDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CheckFabricOrganizationDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
