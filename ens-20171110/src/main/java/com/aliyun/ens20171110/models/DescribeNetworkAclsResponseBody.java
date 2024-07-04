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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A1707FC0-430C-423A-B624-284046B20399</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The description of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>This is EgressAclEntries.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nae-a2d447uw4tillfvgb****</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-2</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the network traffic.</li>
         * <li><strong>drop</strong>: blocks the network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the outbound rule.</p>
         * <ul>
         * <li>If <strong>Protocol</strong> of the outbound rule is set to <strong>all</strong> or <strong>icmp</strong> the port range is <strong>-1/-1</strong>, which indicates all ports.</li>
         * <li>If <strong>Protocol</strong> of the outbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, the port range is in the following format: <strong>1/200</strong> or <strong>80/80</strong>. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: <strong>1 to 65535</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>icmp</strong>: ICMP.</li>
         * <li><strong>tcp</strong>: TCP.</li>
         * <li><strong>udp</strong>: UDP.</li>
         * <li><strong>all</strong>: all protocols.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: The rule is created by the system.</li>
         * <li><strong>custom</strong>: The rule is created by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
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
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The description of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>This is IngressAclEntries.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nae-5dk86arlydmezasw****</p>
         */
        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        /**
         * <p>The name of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-3</p>
         */
        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        /**
         * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the network traffic.</li>
         * <li><strong>drop</strong>: blocks the network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the inbound rule.</p>
         * <ul>
         * <li>If <strong>Protocol</strong> of the inbound rule is set to <strong>all</strong> or <strong>icmp</strong>, the port range is <strong>-1/-1</strong>, which indicates all ports.</li>
         * <li>If <strong>Protocol</strong> of the inbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, the port range is in the following format: <strong>1/200</strong> or <strong>80/80</strong>. 1/200 indicates port 1 to port 200. 80/80 indicates port 80. Valid values for a port: <strong>1 to 65535</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>icmp</strong>: ICMP.</li>
         * <li><strong>tcp</strong>: TCP.</li>
         * <li><strong>udp</strong>: UDP.</li>
         * <li><strong>all</strong>: all protocols.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: The rule is created by the system.</li>
         * <li><strong>custom</strong>: The rule is created by a user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
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
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-fuzhou-telecom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>n-****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Network</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The association status of the resource. Valid values:</p>
         * <ul>
         * <li><strong>BINDED</strong>: The resource is associated with the network ACL.</li>
         * <li><strong>BINDING</strong>: The resource is being associated with the network ACL.</li>
         * <li><strong>UNBINDING</strong>: The resource is being disassociated from the network ACL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BINDING</p>
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
         * <p>The time when the network ACL was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my NetworkAcl.</p>
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
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spxscd****</p>
         */
        @NameInMap("NetworkAclId")
        public String networkAclId;

        /**
         * <p>The name of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-8</p>
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
         * <ul>
         * <li><strong>Available</strong>: The network ACL is available.</li>
         * <li><strong>Modifying</strong>: The network ACL is being configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
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
