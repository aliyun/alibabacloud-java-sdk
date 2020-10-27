// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public String totalCount;

    @NameInMap("FailCount")
    @Validation(required = true)
    public String failCount;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("Results")
    @Validation(required = true)
    public AttachKeyPairResponseResults results;

    public static AttachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponse self = new AttachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachKeyPairResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public AttachKeyPairResponse setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }
    public String getFailCount() {
        return this.failCount;
    }

    public AttachKeyPairResponse setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public AttachKeyPairResponse setResults(AttachKeyPairResponseResults results) {
        this.results = results;
        return this;
    }
    public AttachKeyPairResponseResults getResults() {
        return this.results;
    }

    public static class AttachKeyPairResponseResultsResult extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static AttachKeyPairResponseResultsResult build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseResultsResult self = new AttachKeyPairResponseResultsResult();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseResultsResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachKeyPairResponseResultsResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public AttachKeyPairResponseResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachKeyPairResponseResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachKeyPairResponseResults extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<AttachKeyPairResponseResultsResult> result;

        public static AttachKeyPairResponseResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseResults self = new AttachKeyPairResponseResults();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseResults setResult(java.util.List<AttachKeyPairResponseResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<AttachKeyPairResponseResultsResult> getResult() {
            return this.result;
        }

    }

}
