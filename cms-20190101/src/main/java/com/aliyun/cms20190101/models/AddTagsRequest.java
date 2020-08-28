// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    @NameInMap("Tag")
    @Validation(required = true)
    public java.util.List<AddTagsRequestTag> tag;

    @NameInMap("GroupIds")
    @Validation(required = true)
    public java.util.List<String> groupIds;

    public static AddTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsRequest self = new AddTagsRequest();
        return TeaModel.build(map, self);
    }

    public static class AddTagsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static AddTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsRequestTag self = new AddTagsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
