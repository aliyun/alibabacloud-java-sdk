// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetMemoryResponseBody extends TeaModel {
    @NameInMap("description")
    public String description;

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

    /**
     * <strong>example:</strong>
     * <p>llm-us9hjmt32nysdm5v</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryResponseBody self = new GetMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetMemoryResponseBody setMemoryId(String memoryId) {
        this.memoryId = memoryId;
        return this;
    }
    public String getMemoryId() {
        return this.memoryId;
    }

    public GetMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
