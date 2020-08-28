// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListResourceTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Tags")
    @Validation(required = true)
    public ListResourceTagsResponseTags tags;

    public static ListResourceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTagsResponse self = new ListResourceTagsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListResourceTagsResponseTagsTag extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static ListResourceTagsResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseTagsTag self = new ListResourceTagsResponseTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class ListResourceTagsResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<ListResourceTagsResponseTagsTag> tag;

        public static ListResourceTagsResponseTags build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTagsResponseTags self = new ListResourceTagsResponseTags();
            return TeaModel.build(map, self);
        }

    }

}
