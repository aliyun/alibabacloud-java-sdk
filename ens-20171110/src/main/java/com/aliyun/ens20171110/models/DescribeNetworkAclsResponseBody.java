// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponseBody extends TeaModel {
    @NameInMap("NetworkAcls")
    public java.util.List<DescribeNetworkAclsResponseBodyNetworkAcls> networkAcls;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

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
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkAclEntryId")
        public String networkAclEntryId;

        @NameInMap("NetworkAclEntryName")
        public String networkAclEntryName;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

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
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EgressAclEntries")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsEgressAclEntries> egressAclEntries;

        @NameInMap("IngressAclEntries")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsIngressAclEntries> ingressAclEntries;

        @NameInMap("NetworkAclId")
        public String networkAclId;

        @NameInMap("NetworkAclName")
        public String networkAclName;

        @NameInMap("Resources")
        public java.util.List<DescribeNetworkAclsResponseBodyNetworkAclsResources> resources;

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
