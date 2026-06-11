// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SetWorkspaceCodePublishSettingRequest extends TeaModel {
    /**
     * <p>The deployment configuration, provided as a JSON string. The repos array specifies the Git repositories in the workspace, primarily for setting the branch for publishing. The exclude parameter specifies which directories to skip.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;repos&quot;:[{&quot;repo&quot;:&quot;<a href="mailto:git@xxxx.git">git@xxxx.git</a>&quot;, &quot;branch&quot;:&quot;master&quot;}], &quot;exclude&quot;:[&quot;/.dms&quot;, &quot;/username&quot;]}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The numeric ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SetWorkspaceCodePublishSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWorkspaceCodePublishSettingRequest self = new SetWorkspaceCodePublishSettingRequest();
        return TeaModel.build(map, self);
    }

    public SetWorkspaceCodePublishSettingRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SetWorkspaceCodePublishSettingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
