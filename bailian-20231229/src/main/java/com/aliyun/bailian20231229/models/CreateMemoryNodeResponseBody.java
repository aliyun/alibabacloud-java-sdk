// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68de06c95368463a8be4a84efc872cc5</p>
     */
    @NameInMap("memoryNodeId")
    public String memoryNodeId;

    /**
     * <strong>example:</strong>
     * <p>8C56C7AF-6573-19CE-B018-E05E1EDCF4C5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMemoryNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryNodeResponseBody self = new CreateMemoryNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryNodeResponseBody setMemoryNodeId(String memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
        return this;
    }
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    public CreateMemoryNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
