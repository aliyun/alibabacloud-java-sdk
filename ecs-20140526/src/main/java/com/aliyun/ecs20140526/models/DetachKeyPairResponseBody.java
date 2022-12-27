// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponseBody extends TeaModel {
    // The number of instances from which the SSH key pair failed to be unbound.
    @NameInMap("FailCount")
    public String failCount;

    // The name of the SSH key pair.
    @NameInMap("KeyPairName")
    public String keyPairName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The result set of the unbind operation.
    @NameInMap("Results")
    public DetachKeyPairResponseBodyResults results;

    // The total number of instances from which you attempted to unbind the SSH key pair.
    @NameInMap("TotalCount")
    public String totalCount;

    public static DetachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponseBody self = new DetachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponseBody setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }
    public String getFailCount() {
        return this.failCount;
    }

    public DetachKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DetachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachKeyPairResponseBody setResults(DetachKeyPairResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public DetachKeyPairResponseBodyResults getResults() {
        return this.results;
    }

    public DetachKeyPairResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DetachKeyPairResponseBodyResultsResult extends TeaModel {
        // The operation status code returned. 200 indicates that the operation was successful.
        @NameInMap("Code")
        public String code;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The operation information returned. For example, when the value of `Code` is 200, the value of `Message` is `successful`.
        @NameInMap("Message")
        public String message;

        // Indicates whether the operation was successful.
        @NameInMap("Success")
        public String success;

        public static DetachKeyPairResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseBodyResultsResult self = new DetachKeyPairResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachKeyPairResponseBodyResultsResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachKeyPairResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachKeyPairResponseBodyResultsResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DetachKeyPairResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<DetachKeyPairResponseBodyResultsResult> result;

        public static DetachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseBodyResults self = new DetachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseBodyResults setResult(java.util.List<DetachKeyPairResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DetachKeyPairResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
