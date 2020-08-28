// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponse self = new AddTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
