// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponseBody extends TeaModel {
    /**
     * <p>Details of the network ACLs.</p>
     */
    @NameInMap("NetworkAcls")
    public java.util.List<DescribeNetworkAclsResponseBodyNetworkAcls> networkAcls;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeNetworkAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclsResponseBody self = new DescribeNetworkAclsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclsResponseBody setNetworkAcls(java.util.List<DescribeNetworkAclsResponseBodyNetworkAcls> networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }
    public java.util.List<DescribeNetworkAclsResponseBodyNetworkAcls> getNetworkAcls() {
        return this.networkAcls;
    }

    public DescribeNetworkAclsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkAclsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkAclsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAclsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries extends TeaModel {
        /**
         * <p>The destination CIDR block.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The description of the outbound rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the outbound rule.</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the outbound rule.</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: allows the network traffic.</p>
         * <p>*   **drop**: blocks the network traffic.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the outbound rule.</p>
         * <br>
         * <p>*   If **Protocol** in the outbound rule is set to **all** or **icmp**, \*\*-1/-1\*\* is returned for this parameter. \*\*-1/-1\*\* indicates all ports.</p>
         * <p>*   If **Protocol** in the outbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 120/120 indicates port 1 to port 200 and 80/80 indicates port 80. Valid values for a port: **1 to 65535**.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: **1 to 100**. Default value: **1**.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>*   **icmp**</p>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         * <p>*   **all**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **system**: The rule is created by the system.</p>
         * <p>*   **custom**: The rule is created by a user.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries self = new DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries extends TeaModel {
        /**
         * <p>The source CIDR block.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The description of the inbound rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the inbound rule.</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the inbound rule.</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
         * <br>
         * <p>*   **accept**: allows the network traffic.</p>
         * <p>*   **drop**: blocks the network traffic.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the inbound rule.</p>
         * <br>
         * <p>*   If **Protocol** in the inbound rule is set to **all** or **icmp**, \*\*-1/-1\*\* is returned for this parameter. \*\*-1/-1\*\* indicates all ports.</p>
         * <p>*   If **Protocol** in the inbound rule is set to **tcp** or **udp**, the port range is in the following format: **1/200** or **80/80**. 1/200 indicates port 1 to port 200 and 80/80 indicates port 80. Valid values for a port: **1 to 65535**.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: **1 to 100**. Default value: **1**.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol. Valid values:</p>
         * <br>
         * <p>*   **icmp**</p>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         * <p>*   **all**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **system**: The rule is created by the system.</p>
         * <p>*   **custom**: The rule is created by a user.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries self = new DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setNetworkAclEntryId(String networkAclEntryId) {
            this.networkAclEntryId = networkAclEntryId;
            return this;
        }
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setNetworkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAclsResources extends TeaModel {
        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the associated resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The association status of the resource. Valid values:</p>
         * <br>
         * <p>*   **BINDED**: The resource is associated with the network ACL.</p>
         * <p>*   **BINDING**: The resource is being associated with the network ACL.</p>
         * <p>*   **UNBINDING**: The resource is being disassociated from the network ACL.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNetworkAclsResponseBodyNetworkAclsResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAclsResources self = new DescribeNetworkAclsResponseBodyNetworkAclsResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsResources setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeNetworkAclsResponseBodyNetworkAclsResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeNetworkAclsResponseBodyNetworkAcls extends TeaModel {
        /**
         * <p>The time when the network ACL was created. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the network ACL.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Details of the outbound rules.</p>
         */
        @NameInMap("EgressAclEntries")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries> egressAclEntries;

        /**
         * <p>Details of the inbound rules.</p>
         */
        @NameInMap("IngressAclEntries")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries> ingressAclEntries;

        /**
         * <p>The ID of the network ACL.</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The name of the network ACL.</p>
         */
        @NameInMap("NetworkAclName")
        public String networkAclName;

        /**
         * <p>Details of the associated resources.</p>
         */
        @NameInMap("Resources")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsResources> resources;

        /**
         * <p>The status of the network ACL. Valid values:</p>
         * <br>
         * <p>*   **Available**: The network ACL is available.</p>
         * <p>*   **Modifying**: The network ACL is being configured.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeNetworkAclsResponseBodyNetworkAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAclsResponseBodyNetworkAcls self = new DescribeNetworkAclsResponseBodyNetworkAcls();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setEgressAclEntries(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries> egressAclEntries) {
            this.egressAclEntries = egressAclEntries;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries> getEgressAclEntries() {
            return this.egressAclEntries;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setIngressAclEntries(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries> ingressAclEntries) {
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries> getIngressAclEntries() {
            return this.ingressAclEntries;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setNetworkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setNetworkAclName(String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public String getNetworkAclName() {
            return this.networkAclName;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setResources(java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsResources> getResources() {
            return this.resources;
        }

        public DescribeNetworkAclsResponseBodyNetworkAcls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
