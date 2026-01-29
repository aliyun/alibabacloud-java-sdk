// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateRayClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ray-k7nm8ahl5te4tg91</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRayClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRayClusterResponseBody self = new CreateRayClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRayClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateRayClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
