// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateLiveResponseBody extends TeaModel {
    @NameInMap("liveId")
    public String liveId;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveResponseBody self = new CreateLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveResponseBody setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public CreateLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
