// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentSkillMetaRequest extends TeaModel {
    /**
     * <p>The skill ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ski-04pomiln*************j0</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>56kv1pvl9uvt9**********bb</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataAgentSkillMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentSkillMetaRequest self = new DeleteDataAgentSkillMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentSkillMetaRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public DeleteDataAgentSkillMetaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
