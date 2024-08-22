// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetMemoryNodeResponseBody extends TeaModel {
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>6bff4f317a14442fbc9f73d29dbd5fc3</p>
     */
    @NameInMap("memoryId")
    public String memoryId;

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

    /**
     * <strong>example:</strong>
     * <p>llm-us9hjmt32nysdm5v</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetMemoryNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryNodeResponseBody self = new GetMemoryNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryNodeResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetMemoryNodeResponseBody setMemoryId(String memoryId) {
        this.memoryId = memoryId;
        return this;
    }
    public String getMemoryId() {
        return this.memoryId;
    }

    public GetMemoryNodeResponseBody setMemoryNodeId(String memoryNodeId) {
        this.memoryNodeId = memoryNodeId;
        return this;
    }
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    public GetMemoryNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryNodeResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
