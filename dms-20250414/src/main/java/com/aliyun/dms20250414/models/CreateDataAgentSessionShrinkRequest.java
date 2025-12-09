// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSessionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>f-8*******01m</p>
     */
    @NameInMap("File")
    public String file;

    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSessionShrinkRequest self = new CreateDataAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSessionShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateDataAgentSessionShrinkRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public CreateDataAgentSessionShrinkRequest setSessionConfigShrink(String sessionConfigShrink) {
        this.sessionConfigShrink = sessionConfigShrink;
        return this;
    }
    public String getSessionConfigShrink() {
        return this.sessionConfigShrink;
    }

    public CreateDataAgentSessionShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDataAgentSessionShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
