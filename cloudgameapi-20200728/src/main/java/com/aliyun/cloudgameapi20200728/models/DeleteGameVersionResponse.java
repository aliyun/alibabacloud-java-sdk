// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameVersionResponse self = new DeleteGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGameVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
