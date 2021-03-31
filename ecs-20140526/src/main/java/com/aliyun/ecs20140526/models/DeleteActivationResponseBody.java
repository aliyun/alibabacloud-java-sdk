// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteActivationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Activation")
    public DeleteActivationResponseBodyActivation activation;

    public static DeleteActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteActivationResponseBody self = new DeleteActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteActivationResponseBody setActivation(DeleteActivationResponseBodyActivation activation) {
        this.activation = activation;
        return this;
    }
    public DeleteActivationResponseBodyActivation getActivation() {
        return this.activation;
    }

    public static class DeleteActivationResponseBodyActivation extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        @NameInMap("ActivationId")
        public String activationId;

        public static DeleteActivationResponseBodyActivation build(java.util.Map<String, ?> map) throws Exception {
            DeleteActivationResponseBodyActivation self = new DeleteActivationResponseBodyActivation();
            return TeaModel.build(map, self);
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

        public DeleteActivationResponseBodyActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DeleteActivationResponseBodyActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteActivationResponseBodyActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
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

        public DeleteActivationResponseBodyActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DeleteActivationResponseBodyActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

    }

}
