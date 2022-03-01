// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricConsortiumDomainResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckFabricConsortiumDomainResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CheckFabricConsortiumDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricConsortiumDomainResponseBody self = new CheckFabricConsortiumDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFabricConsortiumDomainResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CheckFabricConsortiumDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFabricConsortiumDomainResponseBody setResult(CheckFabricConsortiumDomainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckFabricConsortiumDomainResponseBodyResult getResult() {
        return this.result;
    }

    public CheckFabricConsortiumDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckFabricConsortiumDomainResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("Valid")
        public Boolean valid;

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

        public CheckFabricConsortiumDomainResponseBodyResult setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public CheckFabricConsortiumDomainResponseBodyResult setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
