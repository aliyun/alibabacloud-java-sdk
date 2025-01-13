// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteActivationResponseBody extends TeaModel {
    /**
     * <p>Details about the activation code and its usage information.</p>
     */
    @NameInMap("Activation")
    public DeleteActivationResponseBodyActivation activation;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F74942176</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteActivationResponseBody self = new DeleteActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteActivationResponseBody setActivation(DeleteActivationResponseBodyActivation activation) {
        this.activation = activation;
        return this;
    }
    public DeleteActivationResponseBodyActivation getActivation() {
        return this.activation;
    }

    public DeleteActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteActivationResponseBodyActivation extends TeaModel {
        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The number of instances that were deregistered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The maximum number of times that the activation code can be used to register managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The default instance name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test-InstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The IP addresses of the hosts that are allowed to use the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        /**
         * <p>The number of instances that were registered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        /**
         * <p>The validity period of the activation code. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        public static DeleteActivationResponseBodyActivation build(java.util.Map<String, ?> map) throws Exception {
            DeleteActivationResponseBodyActivation self = new DeleteActivationResponseBodyActivation();
            return TeaModel.build(map, self);
        }

        public DeleteActivationResponseBodyActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DeleteActivationResponseBodyActivation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DeleteActivationResponseBodyActivation setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DeleteActivationResponseBodyActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteActivationResponseBodyActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DeleteActivationResponseBodyActivation setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DeleteActivationResponseBodyActivation setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DeleteActivationResponseBodyActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DeleteActivationResponseBodyActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

    }

}
