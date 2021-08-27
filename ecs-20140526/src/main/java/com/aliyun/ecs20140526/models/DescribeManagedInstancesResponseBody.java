// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Instances")
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> instances;

    public static DescribeManagedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedInstancesResponseBody self = new DescribeManagedInstancesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeManagedInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeManagedInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeManagedInstancesResponseBody setInstances(java.util.List<DescribeManagedInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeManagedInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ActivationId")
        public String activationId;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("RegistrationTime")
        public String registrationTime;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("InvocationCount")
        public Long invocationCount;

        @NameInMap("MachineId")
        public String machineId;

        public static DescribeManagedInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedInstancesResponseBodyInstances self = new DescribeManagedInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeManagedInstancesResponseBodyInstances setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeManagedInstancesResponseBodyInstances setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public DescribeManagedInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
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

        public DescribeManagedInstancesResponseBodyInstances setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DescribeManagedInstancesResponseBodyInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeManagedInstancesResponseBodyInstances setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeManagedInstancesResponseBodyInstances setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        public DescribeManagedInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
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

        public DescribeManagedInstancesResponseBodyInstances setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeManagedInstancesResponseBodyInstances setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

    }

}
