// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The number of instances from which the SSH key pair failed to be unbound.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailCount")
    public String failCount;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result set of the unbind operation.</p>
     */
    @NameInMap("Results")
    public DetachKeyPairResponseBodyResults results;

    /**
     * <p>The total number of instances from which you want to unbind the SSH key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The operation status code that is returned. 200 indicates that the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1d6tsvznfghy7y****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The result of the operation. For example, if the value of <code>Code</code> is 200, the value of <code>Message</code> is <code>successful</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
