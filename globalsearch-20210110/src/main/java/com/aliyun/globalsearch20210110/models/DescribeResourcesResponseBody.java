// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourcesResponseBody extends TeaModel {
    @NameInMap("EstimatedTotal")
    public Integer estimatedTotal;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public DescribeResourcesResponseBodyResources resources;

    @NameInMap("Truncated")
    public Boolean truncated;

    public static DescribeResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesResponseBody self = new DescribeResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesResponseBody setEstimatedTotal(Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
        return this;
    }
    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    public DescribeResourcesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DescribeResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcesResponseBody setResources(DescribeResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeResourcesResponseBody setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static class DescribeResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        @NameInMap("MatchedAttributes")
        public java.util.Map<String, ?> matchedAttributes;

        @NameInMap("Product")
        public String product;

        @NameInMap("PublicIP")
        public String publicIP;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Released")
        public String released;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceUrl")
        public String resourceUrl;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesResponseBodyResourcesResource self = new DescribeResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesResponseBodyResourcesResource setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeResourcesResponseBodyResourcesResource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeResourcesResponseBodyResourcesResource setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DescribeResourcesResponseBodyResourcesResource setMatchedAttributes(java.util.Map<String, ?> matchedAttributes) {
            this.matchedAttributes = matchedAttributes;
            return this;
        }
        public java.util.Map<String, ?> getMatchedAttributes() {
            return this.matchedAttributes;
        }

        public DescribeResourcesResponseBodyResourcesResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeResourcesResponseBodyResourcesResource setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeResourcesResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourcesResponseBodyResourcesResource setReleased(String released) {
            this.released = released;
            return this;
        }
        public String getReleased() {
            return this.released;
        }

        public DescribeResourcesResponseBodyResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeResourcesResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourcesResponseBodyResourcesResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeResourcesResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeResourcesResponseBodyResourcesResource setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        public DescribeResourcesResponseBodyResourcesResource setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeResourcesResponseBodyResourcesResource> resource;

        public static DescribeResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcesResponseBodyResources self = new DescribeResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourcesResponseBodyResources setResource(java.util.List<DescribeResourcesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeResourcesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
