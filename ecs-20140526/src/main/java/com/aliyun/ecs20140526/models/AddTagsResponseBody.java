// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddTagsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static AddTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponseBody self = new AddTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
