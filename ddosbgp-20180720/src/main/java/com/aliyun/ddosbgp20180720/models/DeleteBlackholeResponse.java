// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteBlackholeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBlackholeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackholeResponse self = new DeleteBlackholeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlackholeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
