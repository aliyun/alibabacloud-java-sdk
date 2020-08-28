// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class RemoveTagsRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<RemoveTagsRequestTag> tag;

    @NameInMap("GroupIds")
    @Validation(required = true)
    public java.util.List<String> groupIds;

    public static RemoveTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsRequest self = new RemoveTagsRequest();
        return TeaModel.build(map, self);
    }

    public static class RemoveTagsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static RemoveTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsRequestTag self = new RemoveTagsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
