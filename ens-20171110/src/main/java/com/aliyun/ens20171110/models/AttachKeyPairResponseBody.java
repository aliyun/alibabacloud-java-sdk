// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The number of instances from which the SSH key pair failed to be unbound.</p>
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
     * <p>ssh-xxx</p>
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
     * <p>The result set of the unbind operation.</p>
     */
    @NameInMap("Results")
    public java.util.List<AttachKeyPairResponseBodyResults> results;

    /**
     * <p>The total number of instances from which the SSH key pair is unbound.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static AttachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponseBody self = new AttachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public AttachKeyPairResponseBody setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
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

    public AttachKeyPairResponseBody setResults(java.util.List<AttachKeyPairResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachKeyPairResponseBodyResults> getResults() {
        return this.results;
    }

    public AttachKeyPairResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class AttachKeyPairResponseBodyResults extends TeaModel {
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

        public static AttachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResults self = new AttachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResults setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AttachKeyPairResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachKeyPairResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachKeyPairResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
