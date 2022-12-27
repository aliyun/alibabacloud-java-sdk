// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponseBody extends TeaModel {
    // Details of the managed instances.
    @NameInMap("Instances")
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> instances;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of managed instances returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeManagedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedInstancesResponseBody self = new DescribeManagedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManagedInstancesResponseBody setInstances(java.util.List<DescribeManagedInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeManagedInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeManagedInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeManagedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeManagedInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeManagedInstancesResponseBodyInstances extends TeaModel {
        // The ID of the activation code.
        @NameInMap("ActivationId")
        public String activationId;

        // The version number of the Cloud Assistant client.
        @NameInMap("AgentVersion")
        public String agentVersion;

        // Indicates whether the managed instance is connected. Valid values:
        // 
        // *   true: The managed instance is connected and you can manage the instance by using Cloud Assistant.
        // *   false: The managed instance is not connected because the managed instance is down or because the Cloud Assistant client is not installed correctly.
        @NameInMap("Connected")
        public Boolean connected;

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

        public static DescribeManagedInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedInstancesResponseBodyInstances self = new DescribeManagedInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeManagedInstancesResponseBodyInstances setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DescribeManagedInstancesResponseBodyInstances setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeManagedInstancesResponseBodyInstances setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public DescribeManagedInstancesResponseBodyInstances setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeManagedInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeManagedInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeManagedInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeManagedInstancesResponseBodyInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeManagedInstancesResponseBodyInstances setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeManagedInstancesResponseBodyInstances setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeManagedInstancesResponseBodyInstances setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DescribeManagedInstancesResponseBodyInstances setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeManagedInstancesResponseBodyInstances setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeManagedInstancesResponseBodyInstances setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

    }

}
