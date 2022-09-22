// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class SetInstanceAutoReleaseTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetInstanceAutoReleaseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceAutoReleaseTimeResponseBody self = new SetInstanceAutoReleaseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetInstanceAutoReleaseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
