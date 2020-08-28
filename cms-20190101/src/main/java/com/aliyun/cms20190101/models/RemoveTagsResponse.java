// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class RemoveTagsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Tag")
    @Validation(required = true)
    public RemoveTagsResponseTag tag;

    public static RemoveTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponse self = new RemoveTagsResponse();
        return TeaModel.build(map, self);
    }

    public static class RemoveTagsResponseTag extends TeaModel {
        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<String> tags;

        public static RemoveTagsResponseTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsResponseTag self = new RemoveTagsResponseTag();
            return TeaModel.build(map, self);
        }

    }

}
