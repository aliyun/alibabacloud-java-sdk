// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAttributeResponseBody extends TeaModel {
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("CloudResources")
    public DescribeNetworkAttributeResponseBodyCloudResources cloudResources;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("NetworkId")
    public String networkId;

    @NameInMap("NetworkName")
    public String networkName;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("ResourceCount")
        public Integer resourceCount;

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
