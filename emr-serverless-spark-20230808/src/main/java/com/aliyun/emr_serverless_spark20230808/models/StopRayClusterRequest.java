// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopRayClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ray-k7nm8ahl5te4tg91-ey7blpbg</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static StopRayClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRayClusterRequest self = new StopRayClusterRequest();
        return TeaModel.build(map, self);
    }

    public StopRayClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
