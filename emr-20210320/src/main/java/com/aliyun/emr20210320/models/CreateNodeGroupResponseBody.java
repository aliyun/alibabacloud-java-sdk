// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>G-21E39B11837E****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
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
