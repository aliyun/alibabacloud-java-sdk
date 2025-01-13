// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeregisterManagedInstanceResponseBody extends TeaModel {
    /**
     * <p>Details of the managed instances.</p>
     */
    @NameInMap("Instance")
    public DeregisterManagedInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F74942176</p>
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
         * <p>The activation code ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F7494****</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The version number of Cloud Assistant Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0.102</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The hostname of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-Hostname</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The managed instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-hz01axdfas****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-InstanceName-001</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p><code>47.8.**.**</code></p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The internal IP address of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.0.**.**</code></p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of times that Cloud Assistant tasks were executed on the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InvocationCount")
        public Long invocationCount;

        /**
         * <p>The time when the Cloud Assistant task was last executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T09:00:40Z</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <p>The machine code of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>e03231b37ab14e53b5795ad625fc****</p>
         */
        @NameInMap("MachineId")
        public String machineId;

        /**
         * <p>The operating system type of the managed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The version information about the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux_#38~18.04.1-Ubuntu SMP Wed Jan 6 18:26:30 UTC 2021_x86_64</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The time when the managed instance was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T08:57:56Z</p>
         */
        @NameInMap("RegistrationTime")
        public String registrationTime;

        /**
         * <p>The ID of the resource group to which the managed instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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

        public DeregisterManagedInstanceResponseBodyInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
