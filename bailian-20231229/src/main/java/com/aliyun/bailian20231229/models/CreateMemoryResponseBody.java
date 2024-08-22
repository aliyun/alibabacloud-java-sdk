// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6bff4f317a14442fbc9f73d29dbd5fc3</p>
     */
    @NameInMap("memoryId")
    public String memoryId;

    /**
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-114029103cad</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponseBody self = new CreateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponseBody setMemoryId(String memoryId) {
        this.memoryId = memoryId;
        return this;
    }
    public String getMemoryId() {
        return this.memoryId;
    }

    public CreateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
