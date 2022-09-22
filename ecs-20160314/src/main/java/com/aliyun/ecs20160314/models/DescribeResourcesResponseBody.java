// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourcesResponseBody extends TeaModel {
    @NameInMap("EstimatedTotal")
    public Integer estimatedTotal;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public Resources resources;

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

    public DescribeResourcesResponseBody setResources(Resources resources) {
        this.resources = resources;
        return this;
    }
    public Resources getResources() {
        return this.resources;
    }

    public DescribeResourcesResponseBody setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static class Resource extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MatchedAttributes")
        public String matchedAttributes;

        @NameInMap("Product")
        public String product;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static Resource build(java.util.Map<String, ?> map) throws Exception {
            Resource self = new Resource();
            return TeaModel.build(map, self);
        }

        public Resource setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public Resource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Resource setMatchedAttributes(String matchedAttributes) {
            this.matchedAttributes = matchedAttributes;
            return this;
        }
        public String getMatchedAttributes() {
            return this.matchedAttributes;
        }

        public Resource setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public Resource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Resource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public Resource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public Resource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public Resource setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<Resource> resource;

        public static Resources build(java.util.Map<String, ?> map) throws Exception {
            Resources self = new Resources();
            return TeaModel.build(map, self);
        }

        public Resources setResource(java.util.List<Resource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

    }

}
