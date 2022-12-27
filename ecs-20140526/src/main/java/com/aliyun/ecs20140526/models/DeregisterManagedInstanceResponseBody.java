// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeregisterManagedInstanceResponseBody extends TeaModel {
    // Details of the managed instance.
    @NameInMap("Instance")
    public DeregisterManagedInstanceResponseBodyInstance instance;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterManagedInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterManagedInstanceResponseBody self = new DeregisterManagedInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterManagedInstanceResponseBody setInstance(DeregisterManagedInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DeregisterManagedInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DeregisterManagedInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeregisterManagedInstanceResponseBodyInstance extends TeaModel {
        // The ID of the activation code.
        @NameInMap("ActivationId")
        public String activationId;

        // The version number of the Cloud Assistant client.
        @NameInMap("AgentVersion")
        public String agentVersion;

        // The hostname of the managed instance.
        @NameInMap("Hostname")
        public String hostname;

        // The ID of the managed instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the managed instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the managed instance.
        @NameInMap("InternetIp")
        public String internetIp;

        // The internal IP address of the managed instance.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The number of times that Cloud Assistant tasks were executed on the managed instance.
        @NameInMap("InvocationCount")
        public Long invocationCount;

        // The last Cloud Assistant task execution time.
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        // The machine code of the managed instance.
        @NameInMap("MachineId")
        public String machineId;

        // The operating system type of the managed instance.
        @NameInMap("OsType")
        public String osType;

        // The version information of the operating system.
        @NameInMap("OsVersion")
        public String osVersion;

        // The time when the managed instance was registered.
        @NameInMap("RegistrationTime")
        public String registrationTime;

        public static DeregisterManagedInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DeregisterManagedInstanceResponseBodyInstance self = new DeregisterManagedInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DeregisterManagedInstanceResponseBodyInstance setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DeregisterManagedInstanceResponseBodyInstance setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DeregisterManagedInstanceResponseBodyInstance setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DeregisterManagedInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeregisterManagedInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DeregisterManagedInstanceResponseBodyInstance setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DeregisterManagedInstanceResponseBodyInstance setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DeregisterManagedInstanceResponseBodyInstance setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DeregisterManagedInstanceResponseBodyInstance setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DeregisterManagedInstanceResponseBodyInstance setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DeregisterManagedInstanceResponseBodyInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DeregisterManagedInstanceResponseBodyInstance setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DeregisterManagedInstanceResponseBodyInstance setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

    }

}
