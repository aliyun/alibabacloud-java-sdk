// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeregisterManagedInstanceResponseBody extends TeaModel {
    /**
     * <p>Details of the managed instance.</p>
     */
    @NameInMap("Instance")
    public DeregisterManagedInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the activation code.</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The version number of the Cloud Assistant client.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The hostname of the managed instance.</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The ID of the managed instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the managed instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the managed instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The internal IP address of the managed instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of times that Cloud Assistant tasks were executed on the managed instance.</p>
         */
        @NameInMap("InvocationCount")
        public Long invocationCount;

        /**
         * <p>The time when the Cloud Assistant task was last executed.</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <p>The machine code of the managed instance.</p>
         */
        @NameInMap("MachineId")
        public String machineId;

        /**
         * <p>The operating system type of the managed instance.</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The version information of the operating system.</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The time when the managed instance was registered.</p>
         */
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
