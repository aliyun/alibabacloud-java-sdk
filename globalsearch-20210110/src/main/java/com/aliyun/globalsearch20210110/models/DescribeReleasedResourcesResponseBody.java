// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeReleasedResourcesResponseBody extends TeaModel {
    @NameInMap("EstimatedTotal")
    public Integer estimatedTotal;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public DescribeReleasedResourcesResponseBodyResources resources;

    @NameInMap("Truncated")
    public Boolean truncated;

    public static DescribeReleasedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasedResourcesResponseBody self = new DescribeReleasedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReleasedResourcesResponseBody setEstimatedTotal(Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
        return this;
    }
    public Integer getEstimatedTotal() {
        return this.estimatedTotal;
    }

    public DescribeReleasedResourcesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DescribeReleasedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReleasedResourcesResponseBody setResources(DescribeReleasedResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeReleasedResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeReleasedResourcesResponseBody setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static class DescribeReleasedResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MatchedAttributes")
        public String matchedAttributes;

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

        public static DescribeReleasedResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeReleasedResourcesResponseBodyResourcesResource self = new DescribeReleasedResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setMatchedAttributes(String matchedAttributes) {
            this.matchedAttributes = matchedAttributes;
            return this;
        }
        public String getMatchedAttributes() {
            return this.matchedAttributes;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setPublicIP(String publicIP) {
            this.publicIP = publicIP;
            return this;
        }
        public String getPublicIP() {
            return this.publicIP;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setReleased(String released) {
            this.released = released;
            return this;
        }
        public String getReleased() {
            return this.released;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        public DescribeReleasedResourcesResponseBodyResourcesResource setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeReleasedResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeReleasedResourcesResponseBodyResourcesResource> resource;

        public static DescribeReleasedResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeReleasedResourcesResponseBodyResources self = new DescribeReleasedResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeReleasedResourcesResponseBodyResources setResource(java.util.List<DescribeReleasedResourcesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeReleasedResourcesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
