// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> instances;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeManagedInstancesResponseBodyInstancesTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeManagedInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedInstancesResponseBodyInstancesTags self = new DescribeManagedInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeManagedInstancesResponseBodyInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeManagedInstancesResponseBodyInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeManagedInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("ActivationId")
        public String activationId;

        @NameInMap("AgentVersion")
        public String agentVersion;

        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("InvocationCount")
        public Long invocationCount;

        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        @NameInMap("MachineId")
        public String machineId;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("RegistrationTime")
        public String registrationTime;

        @NameInMap("Tags")
        public java.util.List<DescribeManagedInstancesResponseBodyInstancesTags> tags;

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

        public DescribeManagedInstancesResponseBodyInstances setTags(java.util.List<DescribeManagedInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeManagedInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

    }

}
