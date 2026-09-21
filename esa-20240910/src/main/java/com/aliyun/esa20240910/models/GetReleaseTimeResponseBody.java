// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetReleaseTimeResponseBody extends TeaModel {
    /**
     * <p>The scheduled release time. Format: yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02T06:00:00Z</p>
     */
    @NameInMap("ReleaseTime")
    public String releaseTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6abd807e-ed2a-****-ac54-ac38a62472e6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetReleaseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseTimeResponseBody self = new GetReleaseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReleaseTimeResponseBody setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public GetReleaseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
