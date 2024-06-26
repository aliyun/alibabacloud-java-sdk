// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateSmartContractJobResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateSmartContractJobResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSmartContractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartContractJobResponseBody self = new CreateSmartContractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmartContractJobResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateSmartContractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmartContractJobResponseBody setResult(CreateSmartContractJobResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSmartContractJobResponseBodyResult getResult() {
        return this.result;
    }

    public CreateSmartContractJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSmartContractJobResponseBodyResult extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("Dir")
        public Integer dir;

        @NameInMap("Expire")
        public Long expire;

        @NameInMap("Host")
        public String host;

        @NameInMap("JobID")
        public String jobID;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Signature")
        public String signature;

        public static CreateSmartContractJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSmartContractJobResponseBodyResult self = new CreateSmartContractJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSmartContractJobResponseBodyResult setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public CreateSmartContractJobResponseBodyResult setDir(Integer dir) {
            this.dir = dir;
            return this;
        }
        public Integer getDir() {
            return this.dir;
        }

        public CreateSmartContractJobResponseBodyResult setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public CreateSmartContractJobResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateSmartContractJobResponseBodyResult setJobID(String jobID) {
            this.jobID = jobID;
            return this;
        }
        public String getJobID() {
            return this.jobID;
        }

        public CreateSmartContractJobResponseBodyResult setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateSmartContractJobResponseBodyResult setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
