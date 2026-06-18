// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetMemoryResponseBody extends TeaModel {
    /**
     * <p>The description of the long-term memory.</p>
     * 
     * <strong>example:</strong>
     * <p>我的大模型应用$APP_ID关于A用户的长期记忆体</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the long-term memory.</p>
     * 
     * <strong>example:</strong>
     * <p>6bff4f317a14442fbc9f73d29dbdxxxx</p>
     */
    @NameInMap("memoryId")
    public String memoryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the workspace to which the long-term memory belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-3z7uw7fwz0vexxxx</p>
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
