// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHybridClusterConfigResponseBody extends TeaModel {
    @NameInMap("ClusterConfig")
    public String clusterConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHybridClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHybridClusterConfigResponseBody self = new GetHybridClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHybridClusterConfigResponseBody setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    public GetHybridClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
