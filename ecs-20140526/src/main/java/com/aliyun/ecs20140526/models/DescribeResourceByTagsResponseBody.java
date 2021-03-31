// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Resources")
    public DescribeResourceByTagsResponseBodyResources resources;

    public static DescribeResourceByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsResponseBody self = new DescribeResourceByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeResourceByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceByTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceByTagsResponseBody setResources(DescribeResourceByTagsResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeResourceByTagsResponseBodyResources getResources() {
        return this.resources;
    }

    public static class DescribeResourceByTagsResponseBodyResourcesResource extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeResourceByTagsResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseBodyResourcesResource self = new DescribeResourceByTagsResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeResourceByTagsResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeResourceByTagsResponseBodyResourcesResource> resource;

        public static DescribeResourceByTagsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseBodyResources self = new DescribeResourceByTagsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsResponseBodyResources setResource(java.util.List<DescribeResourceByTagsResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeResourceByTagsResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
