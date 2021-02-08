// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableActivationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Activation")
    @Validation(required = true)
    public DisableActivationResponseActivation activation;

    public static DisableActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableActivationResponse self = new DisableActivationResponse();
        return TeaModel.build(map, self);
    }

    public DisableActivationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableActivationResponse setActivation(DisableActivationResponseActivation activation) {
        this.activation = activation;
        return this;
    }
    public DisableActivationResponseActivation getActivation() {
        return this.activation;
    }

    public static class DisableActivationResponseActivation extends TeaModel {
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

        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DisableActivationResponseActivation build(java.util.Map<String, ?> map) throws Exception {
            DisableActivationResponseActivation self = new DisableActivationResponseActivation();
            return TeaModel.build(map, self);
        }

        public DisableActivationResponseActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DisableActivationResponseActivation setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DisableActivationResponseActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DisableActivationResponseActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DisableActivationResponseActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DisableActivationResponseActivation setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DisableActivationResponseActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DisableActivationResponseActivation setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DisableActivationResponseActivation setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DisableActivationResponseActivation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

}
