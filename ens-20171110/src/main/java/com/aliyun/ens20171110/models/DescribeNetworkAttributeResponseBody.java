// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAttributeResponseBody extends TeaModel {
    /**
     * <p>The IPv4 CIDR block of the network.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The list of resources in the network.</p>
     */
    @NameInMap("CloudResources")
    public DescribeNetworkAttributeResponseBodyCloudResources cloudResources;

    /**
     * <p>The time when the network was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The description of the network.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the edge node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the network access control list (ACL).</p>
     */
    @NameInMap("NetworkAclId")
    public String networkAclId;

    /**
     * <p>The ID of the network.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The name of the network.</p>
     */
    @NameInMap("NetworkName")
    public String networkName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route table.</p>
     */
    @NameInMap("RouterTableId")
    public String routerTableId;

    /**
     * <p>The status of the network. Valid values:</p>
     * <br>
     * <p>*   Pending</p>
     * <p>*   Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of vSwitches in the network.</p>
     */
    @NameInMap("VSwitchIds")
    public DescribeNetworkAttributeResponseBodyVSwitchIds vSwitchIds;

    public static DescribeNetworkAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAttributeResponseBody self = new DescribeNetworkAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAttributeResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeNetworkAttributeResponseBody setCloudResources(DescribeNetworkAttributeResponseBodyCloudResources cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }
    public DescribeNetworkAttributeResponseBodyCloudResources getCloudResources() {
        return this.cloudResources;
    }

    public DescribeNetworkAttributeResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeNetworkAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeNetworkAttributeResponseBody setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeNetworkAttributeResponseBody setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public DescribeNetworkAttributeResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeNetworkAttributeResponseBody setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public DescribeNetworkAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkAttributeResponseBody setRouterTableId(String routerTableId) {
        this.routerTableId = routerTableId;
        return this;
    }
    public String getRouterTableId() {
        return this.routerTableId;
    }

    public DescribeNetworkAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkAttributeResponseBody setVSwitchIds(DescribeNetworkAttributeResponseBodyVSwitchIds vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public DescribeNetworkAttributeResponseBodyVSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static class DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType extends TeaModel {
        /**
         * <p>The number of resources in the network.</p>
         */
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        /**
         * <p>The resource type. VSwitch.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType self = new DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeNetworkAttributeResponseBodyCloudResources extends TeaModel {
        @NameInMap("CloudResourceSetType")
        public java.util.List<DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType> cloudResourceSetType;

        public static DescribeNetworkAttributeResponseBodyCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAttributeResponseBodyCloudResources self = new DescribeNetworkAttributeResponseBodyCloudResources();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAttributeResponseBodyCloudResources setCloudResourceSetType(java.util.List<DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType> cloudResourceSetType) {
            this.cloudResourceSetType = cloudResourceSetType;
            return this;
        }
        public java.util.List<DescribeNetworkAttributeResponseBodyCloudResourcesCloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

    }

    public static class DescribeNetworkAttributeResponseBodyVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeNetworkAttributeResponseBodyVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkAttributeResponseBodyVSwitchIds self = new DescribeNetworkAttributeResponseBodyVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkAttributeResponseBodyVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
