// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C1E5359-71D7-44D8-8FAA-0327B549157X</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the resources to which the tags are bound.</p>
     */
    @NameInMap("Resources")
    public DescribeResourceByTagsResponseBodyResources resources;

    /**
     * <p>The total number of resources returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeResourceByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsResponseBody self = new DescribeResourceByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceByTagsResponseBody setResources(DescribeResourceByTagsResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeResourceByTagsResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeResourceByTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeResourceByTagsResponseBodyResourcesResource extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp16t2cgmiiy7t1c****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeResourceByTagsResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseBodyResourcesResource self = new DescribeResourceByTagsResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeResourceByTagsResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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
