// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectResponse self = new DeleteProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
