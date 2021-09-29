// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeleteGameVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGameVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGameVersionResponseBody self = new DeleteGameVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGameVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
