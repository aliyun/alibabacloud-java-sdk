// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableActivationResponseBody extends TeaModel {
    /**
     * <p>The time when the activation code was created.</p>
     */
    @NameInMap("Activation")
    public DisableActivationResponseBodyActivation activation;

    /**
     * <p>Details about the activation code and its usage information.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F74942176</p>
     */
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
        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The number of instances that were deregistered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The maximum number of times that the activation code can be used to register managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        /**
         * <p>The number of registered instances.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IP addresses of the hosts that can use the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>Indicates whether the activation code is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>test-InstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The validity period of the activation code. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        /**
         * <p>The default prefix of the instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        /**
         * <p>The activation code ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
