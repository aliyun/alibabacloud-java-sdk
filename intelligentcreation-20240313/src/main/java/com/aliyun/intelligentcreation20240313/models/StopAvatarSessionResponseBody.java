// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class StopAvatarSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>725E87CD-F2DE-5FC4-8A09-2EBDFBF26DAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
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
