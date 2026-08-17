// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RefreshNodeGroupNodesResponseBody extends TeaModel {
    /**
     * <p>The task ID. Query the task progress by calling DescribeNodeGroupRefreshTask. If no nodes have configuration drift, no task is created and this field returns an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>task-159136551662516768776</p>
     */
    @NameInMap("NodeGroupRefreshTaskId")
    public String nodeGroupRefreshTaskId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshNodeGroupNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshNodeGroupNodesResponseBody self = new RefreshNodeGroupNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshNodeGroupNodesResponseBody setNodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
        this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
        return this;
    }
    public String getNodeGroupRefreshTaskId() {
        return this.nodeGroupRefreshTaskId;
    }

    public RefreshNodeGroupNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
