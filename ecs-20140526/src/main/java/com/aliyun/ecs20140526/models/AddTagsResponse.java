// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponse self = new AddTagsResponse();
        return TeaModel.build(map, self);
    }

}
