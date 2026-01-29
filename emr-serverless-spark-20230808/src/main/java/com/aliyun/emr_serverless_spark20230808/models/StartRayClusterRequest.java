// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartRayClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c533e141-bf99-4236-8b6b-30e133db113c</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static StartRayClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRayClusterRequest self = new StartRayClusterRequest();
        return TeaModel.build(map, self);
    }

    public StartRayClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
