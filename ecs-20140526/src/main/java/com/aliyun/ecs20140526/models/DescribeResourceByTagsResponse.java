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

    }

    public static class DescribeResourceByTagsResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeResourceByTagsResponseResourcesResource> resource;

        public static DescribeResourceByTagsResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsResponseResources self = new DescribeResourceByTagsResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
