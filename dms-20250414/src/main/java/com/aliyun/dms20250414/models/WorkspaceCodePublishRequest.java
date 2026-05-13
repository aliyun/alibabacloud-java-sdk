// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceCodePublishRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;repos&quot;:[{&quot;repo&quot;:&quot;<a href="mailto:git@xxxx.git">git@xxxx.git</a>&quot;, &quot;branch&quot;:&quot;master&quot;}], &quot;exclude&quot;:[&quot;/.dms&quot;, &quot;/username&quot;]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkspaceCodePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceCodePublishRequest self = new WorkspaceCodePublishRequest();
        return TeaModel.build(map, self);
    }

    public WorkspaceCodePublishRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public WorkspaceCodePublishRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
