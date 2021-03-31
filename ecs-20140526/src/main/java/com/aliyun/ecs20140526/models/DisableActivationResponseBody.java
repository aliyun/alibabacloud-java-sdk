// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableActivationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Activation")
    public DisableActivationResponseBodyActivation activation;

    public static DisableActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableActivationResponseBody self = new DisableActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableActivationResponseBody setActivation(DisableActivationResponseBodyActivation activation) {
        this.activation = activation;
        return this;
    }
    public DisableActivationResponseBodyActivation getActivation() {
        return this.activation;
    }

    public static class DisableActivationResponseBodyActivation extends TeaModel {
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

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        @NameInMap("ActivationId")
        public String activationId;

        public static DisableActivationResponseBodyActivation build(java.util.Map<String, ?> map) throws Exception {
            DisableActivationResponseBodyActivation self = new DisableActivationResponseBodyActivation();
            return TeaModel.build(map, self);
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

        public DisableActivationResponseBodyActivation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DisableActivationResponseBodyActivation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DisableActivationResponseBodyActivation setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DisableActivationResponseBodyActivation setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DisableActivationResponseBodyActivation setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DisableActivationResponseBodyActivation setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DisableActivationResponseBodyActivation setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DisableActivationResponseBodyActivation setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

    }

}
