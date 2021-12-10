// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameResponseBody self = new DeleteGameResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
