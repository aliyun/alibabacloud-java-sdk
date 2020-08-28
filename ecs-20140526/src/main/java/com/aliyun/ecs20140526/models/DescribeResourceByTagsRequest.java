// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeResourceByTagsRequestTag> tag;

    public static DescribeResourceByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsRequest self = new DescribeResourceByTagsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeResourceByTagsRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeResourceByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsRequestTag self = new DescribeResourceByTagsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
