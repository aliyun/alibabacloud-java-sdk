// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
    /**
     * <p>The long-term memory ID.</p>
     * <blockquote>
     * <p>Store this value properly. It is required for all subsequent API operations related to this long-term memory.
     * .</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6bff4f317a14442fbc9f73d29dbxxxx</p>
     */
    @NameInMap("memoryId")
    public String memoryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A--2446A84821CA</p>
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
