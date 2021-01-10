// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSyncGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCasterSyncGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSyncGroupResponseBody self = new SetCasterSyncGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterSyncGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
