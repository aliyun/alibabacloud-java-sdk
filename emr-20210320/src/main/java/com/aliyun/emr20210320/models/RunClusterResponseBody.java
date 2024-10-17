// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunClusterResponseBody extends TeaModel {
    /**
     * <p>集群ID。</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac7f7***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>操作ID。</p>
     * 
     * <strong>example:</strong>
     * <p>op-13c37a77c505****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunClusterResponseBody self = new RunClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RunClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunClusterResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RunClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
