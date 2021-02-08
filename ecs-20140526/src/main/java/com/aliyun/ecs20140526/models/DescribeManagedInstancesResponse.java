// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeManagedInstancesResponseInstances> instances;

    public static DescribeManagedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedInstancesResponse self = new DescribeManagedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeManagedInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeManagedInstancesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeManagedInstancesResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeManagedInstancesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeManagedInstancesResponse setInstances(java.util.List<DescribeManagedInstancesResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeManagedInstancesResponseInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeManagedInstancesResponseInstances extends TeaModel {
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

        @NameInMap("Connected")
        @Validation(required = true)
        public Boolean connected;

        public static DescribeManagedInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedInstancesResponseInstances self = new DescribeManagedInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeManagedInstancesResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeManagedInstancesResponseInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeManagedInstancesResponseInstances setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DescribeManagedInstancesResponseInstances setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeManagedInstancesResponseInstances setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DescribeManagedInstancesResponseInstances setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeManagedInstancesResponseInstances setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeManagedInstancesResponseInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeManagedInstancesResponseInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeManagedInstancesResponseInstances setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeManagedInstancesResponseInstances setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        public DescribeManagedInstancesResponseInstances setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeManagedInstancesResponseInstances setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeManagedInstancesResponseInstances setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

    }

}
