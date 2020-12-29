// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricOrganizationDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CheckFabricOrganizationDomainResponseBodyResult result;

    public static CheckFabricOrganizationDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricOrganizationDomainResponseBody self = new CheckFabricOrganizationDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFabricOrganizationDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFabricOrganizationDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckFabricOrganizationDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckFabricOrganizationDomainResponseBody setResult(CheckFabricOrganizationDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckFabricOrganizationDomainResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckFabricOrganizationDomainResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Valid")
        public Boolean valid;

        @NameInMap("Prompt")
        public String prompt;

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

        public CheckFabricOrganizationDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

        public CheckFabricOrganizationDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

}
