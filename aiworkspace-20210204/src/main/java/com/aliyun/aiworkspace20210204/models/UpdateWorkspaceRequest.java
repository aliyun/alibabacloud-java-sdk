// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the workspace.</p>
     * <ul>
     * <li>The name must be 3 to 23 characters in length, and can contain letters, underscores (_), and digits.</li>
     * <li>The name must start with a letter.</li>
     * <li>The name must be unique in the current region.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
