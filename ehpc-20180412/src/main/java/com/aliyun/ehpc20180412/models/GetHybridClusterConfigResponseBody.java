// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHybridClusterConfigResponseBody extends TeaModel {
    /**
     * <p>The configurations returned.</p>
     * <br>
     * <p>*   If the parameter Node is null, you can obtain the configurations of the hybrid cloud cluster.</p>
     * <p>*   If the parameter Node is a specified on-premises compute node, you can obtain the configurations of the on-premises compute node.</p>
     * <br>
     * <p>This parameter is returned in the ini format. You can use this parameter to configure on-premises cluster nodes.</p>
     */
    @NameInMap("ClusterConfig")
    public String clusterConfig;

    /**
     * <p>The ID of the request.</p>
     */
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
