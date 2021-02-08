// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponse extends TeaModel {
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
    public DetachKeyPairResponseResults results;

    public static DetachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponse self = new DetachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachKeyPairResponse setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DetachKeyPairResponse setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }
    public String getFailCount() {
        return this.failCount;
    }

    public DetachKeyPairResponse setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DetachKeyPairResponse setResults(DetachKeyPairResponseResults results) {
        this.results = results;
        return this;
    }
    public DetachKeyPairResponseResults getResults() {
        return this.results;
    }

    public static class DetachKeyPairResponseResultsResult extends TeaModel {
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

        public static DetachKeyPairResponseResultsResult build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseResultsResult self = new DetachKeyPairResponseResultsResult();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseResultsResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachKeyPairResponseResultsResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public DetachKeyPairResponseResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachKeyPairResponseResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachKeyPairResponseResults extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<DetachKeyPairResponseResultsResult> result;

        public static DetachKeyPairResponseResults build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseResults self = new DetachKeyPairResponseResults();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseResults setResult(java.util.List<DetachKeyPairResponseResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DetachKeyPairResponseResultsResult> getResult() {
            return this.result;
        }

    }

}
