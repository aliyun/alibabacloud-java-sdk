// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    @NameInMap("TagFilter")
    public java.util.List<ListTagResourcesRequestTagFilter> tagFilter;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class ListTagResourcesRequestTagFilter extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static ListTagResourcesRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTagFilter self = new ListTagResourcesRequestTagFilter();
            return TeaModel.build(map, self);
        }

    }

}
