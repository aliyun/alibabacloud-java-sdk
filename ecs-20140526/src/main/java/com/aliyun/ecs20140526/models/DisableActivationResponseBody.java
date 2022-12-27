// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableActivationResponseBody extends TeaModel {
    // Details about the activation code and its usage information.
    @NameInMap("Activation")
    public DisableActivationResponseBodyActivation activation;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DisableActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableActivationResponseBody self = new DisableActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableActivationResponseBody setActivation(DisableActivationResponseBodyActivation activation) {
        this.activation = activation;
        return this;
    }
    public DisableActivationResponseBodyActivation getActivation() {
        return this.activation;
    }

    public DisableActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DisableActivationResponseBodyActivation extends TeaModel {
        // The ID of the activation code.
        @NameInMap("ActivationId")
        public String activationId;

        // The time when the activation code was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The number of instances that were deregistered.
        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        // The description of the activation code.
        @NameInMap("Description")
        public String description;

        // Indicates whether the activation code is disabled.
        @NameInMap("Disabled")
        public Boolean disabled;

        // The maximum number of times that the activation code can be used to register managed instances.
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        // The default instance name prefix.
        @NameInMap("InstanceName")
        public String instanceName;

        // The IP addresses of hosts that are allowed to use the activation code.
        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        // The number of instances that were registered.
        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        // The validity period of the activation code. Unit: hours.
        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        public static DisableActivationResponseBodyActivation build(java.util.Map<String, ?> map) throws Exception {
            DisableActivationResponseBodyActivation self = new DisableActivationResponseBodyActivation();
            return TeaModel.build(map, self);
        }

        public DisableActivationResponseBodyActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DisableActivationResponseBodyActivation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DisableActivationResponseBodyActivation setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DisableActivationResponseBodyActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DisableActivationResponseBodyActivation setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DisableActivationResponseBodyActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DisableActivationResponseBodyActivation setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DisableActivationResponseBodyActivation setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DisableActivationResponseBodyActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DisableActivationResponseBodyActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

    }

}
