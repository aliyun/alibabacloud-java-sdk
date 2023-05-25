// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The number of instances to which the key pair fails to be bound.</p>
     */
    @NameInMap("FailCount")
    public String failCount;

    /**
     * <p>The names of the key pairs.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that contains the results of the operation.</p>
     */
    @NameInMap("Results")
    public AttachKeyPairResponseBodyResults results;

    /**
     * <p>The total number of instances to which the SSH key pair is bound.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static AttachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponseBody self = new AttachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponseBody setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }
    public String getFailCount() {
        return this.failCount;
    }

    public AttachKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public AttachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachKeyPairResponseBody setResults(AttachKeyPairResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public AttachKeyPairResponseBodyResults getResults() {
        return this.results;
    }

    public AttachKeyPairResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class AttachKeyPairResponseBodyResultsResult extends TeaModel {
        /**
         * <p>The operation status code returned. 200 indicates that the operation was successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The operation information returned. When the value of Code is 200, the value of Message is successful.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        @NameInMap("Success")
        public String success;

        public static AttachKeyPairResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResultsResult self = new AttachKeyPairResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachKeyPairResponseBodyResultsResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachKeyPairResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachKeyPairResponseBodyResultsResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class AttachKeyPairResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<AttachKeyPairResponseBodyResultsResult> result;

        public static AttachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResults self = new AttachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResults setResult(java.util.List<AttachKeyPairResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<AttachKeyPairResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
