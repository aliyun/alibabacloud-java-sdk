// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponse self = new RemoveTagsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
