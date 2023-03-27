// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponseBody self = new RemoveTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
