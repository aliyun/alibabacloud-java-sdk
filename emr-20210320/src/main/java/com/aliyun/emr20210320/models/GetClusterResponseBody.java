// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterResponseBody extends TeaModel {
    /**
     * <p>The details of the cluster.</p>
     */
    @NameInMap("Cluster")
    public Cluster cluster;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponseBody self = new GetClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterResponseBody setCluster(Cluster cluster) {
        this.cluster = cluster;
        return this;
    }
    public Cluster getCluster() {
        return this.cluster;
    }

    public GetClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
