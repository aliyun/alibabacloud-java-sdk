// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesResponseBody extends TeaModel {
    /**
     * <p>The queried managed instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeManagedInstancesResponseBodyInstances> instances;

    /**
     * <p>The query token returned in the call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried managed instances.</p>
     */
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

    public DescribeManagedInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The key of tag N of the managed instance. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of tag N of the managed instance. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
         */
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
        /**
         * <p>The ID of the activation code.</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The version number of Cloud Assistant Agent.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>Indicates whether the managed instance is connected. Valid values:</p>
         * <br>
         * <p>*   true: The managed instance is connected and you can manage the instance by using Cloud Assistant.</p>
         * <p>*   false: The managed instance is not connected because the managed instance is down or because Cloud Assistant Agent is not installed correctly.</p>
         */
        @NameInMap("Connected")
        public Boolean connected;

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

        /**
         * <p>The ID of the resource group to which the managed instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the managed instance.</p>
         */
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

        public DescribeManagedInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
