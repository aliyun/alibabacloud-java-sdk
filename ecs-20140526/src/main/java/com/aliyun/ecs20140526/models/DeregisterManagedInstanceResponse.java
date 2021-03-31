// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeregisterManagedInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instance")
    @Validation(required = true)
    public DeregisterManagedInstanceResponseInstance instance;

    public static DeregisterManagedInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterManagedInstanceResponse self = new DeregisterManagedInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterManagedInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeregisterManagedInstanceResponse setInstance(DeregisterManagedInstanceResponseInstance instance) {
        this.instance = instance;
        return this;
    }
    public DeregisterManagedInstanceResponseInstance getInstance() {
        return this.instance;
    }

    public static class DeregisterManagedInstanceResponseInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("ActivationId")
        @Validation(required = true)
        public String activationId;

        @NameInMap("Hostname")
        @Validation(required = true)
        public String hostname;

        @NameInMap("MachineId")
        @Validation(required = true)
        public String machineId;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        @NameInMap("OsVersion")
        @Validation(required = true)
        public String osVersion;

        @NameInMap("IntranetIp")
        @Validation(required = true)
        public String intranetIp;

        @NameInMap("InternetIp")
        @Validation(required = true)
        public String internetIp;

        @NameInMap("AgentVersion")
        @Validation(required = true)
        public String agentVersion;

        @NameInMap("RegistrationTime")
        @Validation(required = true)
        public String registrationTime;

        @NameInMap("InvocationCount")
        @Validation(required = true)
        public Long invocationCount;

        @NameInMap("LastInvokedTime")
        @Validation(required = true)
        public String lastInvokedTime;

        public static DeregisterManagedInstanceResponseInstance build(java.util.Map<String, ?> map) throws Exception {
            DeregisterManagedInstanceResponseInstance self = new DeregisterManagedInstanceResponseInstance();
            return TeaModel.build(map, self);
        }

        public DeregisterManagedInstanceResponseInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeregisterManagedInstanceResponseInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DeregisterManagedInstanceResponseInstance setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DeregisterManagedInstanceResponseInstance setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DeregisterManagedInstanceResponseInstance setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DeregisterManagedInstanceResponseInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DeregisterManagedInstanceResponseInstance setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DeregisterManagedInstanceResponseInstance setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DeregisterManagedInstanceResponseInstance setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DeregisterManagedInstanceResponseInstance setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DeregisterManagedInstanceResponseInstance setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        public DeregisterManagedInstanceResponseInstance setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DeregisterManagedInstanceResponseInstance setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

    }

}
