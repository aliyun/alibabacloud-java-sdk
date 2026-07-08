// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetClipsBuildInResourceRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>0 - 音色
     * 1- 背景音</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The ID of the Alibaba Cloud Model Studio workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-az2gglkjauwnnhpq</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetClipsBuildInResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClipsBuildInResourceRequest self = new GetClipsBuildInResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetClipsBuildInResourceRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GetClipsBuildInResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
