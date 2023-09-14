// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetNodeGroupResponseBody extends TeaModel {
    /**
     * <p>The node group.</p>
     */
    @NameInMap("NodeGroup")
    public NodeGroup nodeGroup;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeGroupResponseBody self = new GetNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeGroupResponseBody setNodeGroup(NodeGroup nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public NodeGroup getNodeGroup() {
        return this.nodeGroup;
    }

    public GetNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
