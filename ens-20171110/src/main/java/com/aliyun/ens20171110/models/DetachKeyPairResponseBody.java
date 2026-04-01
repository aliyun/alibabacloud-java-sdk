// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The number of instances to which the SSH key pair failed to be bound.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The ID of the SSH key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>ssh-xxx</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The name of the SSH key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>test-kp</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xx-xx-xx-xx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation results.</p>
     */
    @NameInMap("Results")
    public java.util.List<DetachKeyPairResponseBodyResults> results;

    /**
     * <p>The total number of instances to which the SSH key pair is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DetachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponseBody self = new DetachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DetachKeyPairResponseBody setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
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

    public DetachKeyPairResponseBody setResults(java.util.List<DetachKeyPairResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachKeyPairResponseBodyResults> getResults() {
        return this.results;
    }

    public DetachKeyPairResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DetachKeyPairResponseBodyResults extends TeaModel {
        /**
         * <p>The status code of the operation. 200 indicates that the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The message of the operation. If the value of the Code parameter is 200, the value of this parameter is successful.</p>
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
        public Boolean success;

        public static DetachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseBodyResults self = new DetachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseBodyResults setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DetachKeyPairResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachKeyPairResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachKeyPairResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
