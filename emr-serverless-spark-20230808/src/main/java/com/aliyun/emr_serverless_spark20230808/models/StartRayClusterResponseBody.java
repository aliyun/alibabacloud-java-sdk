// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartRayClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8CE06D75-E6A2-505D-9B4B-31DEE3D98A04</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartRayClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRayClusterResponseBody self = new StartRayClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRayClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
