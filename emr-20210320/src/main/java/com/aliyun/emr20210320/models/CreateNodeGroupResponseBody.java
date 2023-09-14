// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupResponseBody extends TeaModel {
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupResponseBody self = new CreateNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupResponseBody setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public CreateNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
