// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeResourceByTagsResponseResources resources;

    public static DescribeResourceByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsResponse self = new DescribeResourceByTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceByTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceByTagsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceByTagsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeResourceByTagsResponse setResources(DescribeResourceByTagsResponseResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeResourceByTagsResponseResources getResources() {
        return this.resources;
    }

    public static class DescribeResourceByTagsResponseResourcesResource extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DescribeResourceByTagsResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseResourcesResource self = new DescribeResourceByTagsResponseResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsResponseResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourceByTagsResponseResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeResourceByTagsResponseResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeResourceByTagsResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeResourceByTagsResponseResourcesResource> resource;

        public static DescribeResourceByTagsResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseResources self = new DescribeResourceByTagsResponseResources();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsResponseResources setResource(java.util.List<DescribeResourceByTagsResponseResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeResourceByTagsResponseResourcesResource> getResource() {
            return this.resource;
        }

    }

}
