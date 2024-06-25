// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterResponseBody extends TeaModel {
    /**
     * <p>集群ID。</p>
     * 
     * <strong>example:</strong>
     * <p>c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>0527ac9a-c899-4341-a21a-****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>任务ID。</p>
     * 
     * <strong>example:</strong>
     * <p>T-5faa48fb31b6b8078d00****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static UpgradeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterResponseBody self = new UpgradeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpgradeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
