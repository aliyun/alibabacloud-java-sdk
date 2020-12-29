// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricConsortiumDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CheckFabricConsortiumDomainResponseBodyResult result;

    public static CheckFabricConsortiumDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricConsortiumDomainResponseBody self = new CheckFabricConsortiumDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFabricConsortiumDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFabricConsortiumDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckFabricConsortiumDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckFabricConsortiumDomainResponseBody setResult(CheckFabricConsortiumDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckFabricConsortiumDomainResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckFabricConsortiumDomainResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Valid")
        public Boolean valid;

        @NameInMap("Prompt")
        public String prompt;

        public static CheckFabricConsortiumDomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckFabricConsortiumDomainResponseBodyResult self = new CheckFabricConsortiumDomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckFabricConsortiumDomainResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckFabricConsortiumDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

        public CheckFabricConsortiumDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

}
