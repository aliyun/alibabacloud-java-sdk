// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteActivationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Activation")
    @Validation(required = true)
    public DeleteActivationResponseActivation activation;

    public static DeleteActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteActivationResponse self = new DeleteActivationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteActivationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteActivationResponse setActivation(DeleteActivationResponseActivation activation) {
        this.activation = activation;
        return this;
    }
    public DeleteActivationResponseActivation getActivation() {
        return this.activation;
    }

    public static class DeleteActivationResponseActivation extends TeaModel {
        @NameInMap("ActivationId")
        @Validation(required = true)
        public String activationId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public Integer instanceCount;

        @NameInMap("TimeToLiveInHours")
        @Validation(required = true)
        public Long timeToLiveInHours;

        @NameInMap("IpAddressRange")
        @Validation(required = true)
        public String ipAddressRange;

        @NameInMap("RegisteredCount")
        @Validation(required = true)
        public Integer registeredCount;

        @NameInMap("DeregisteredCount")
        @Validation(required = true)
        public Integer deregisteredCount;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DeleteActivationResponseActivation build(java.util.Map<String, ?> map) throws Exception {
            DeleteActivationResponseActivation self = new DeleteActivationResponseActivation();
            return TeaModel.build(map, self);
        }

        public DeleteActivationResponseActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DeleteActivationResponseActivation setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DeleteActivationResponseActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteActivationResponseActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DeleteActivationResponseActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DeleteActivationResponseActivation setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DeleteActivationResponseActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DeleteActivationResponseActivation setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DeleteActivationResponseActivation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

}
