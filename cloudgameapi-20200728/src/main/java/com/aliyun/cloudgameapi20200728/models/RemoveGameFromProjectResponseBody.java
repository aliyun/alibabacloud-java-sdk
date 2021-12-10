// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RemoveGameFromProjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveGameFromProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGameFromProjectResponseBody self = new RemoveGameFromProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGameFromProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
