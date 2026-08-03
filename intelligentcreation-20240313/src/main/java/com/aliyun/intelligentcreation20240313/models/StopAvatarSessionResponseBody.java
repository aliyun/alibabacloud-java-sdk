// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopAvatarSessionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static StopAvatarSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAvatarSessionResponseBody self = new StopAvatarSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAvatarSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopAvatarSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
