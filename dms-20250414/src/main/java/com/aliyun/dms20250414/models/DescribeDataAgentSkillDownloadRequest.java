// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSkillDownloadRequest extends TeaModel {
    /**
     * <p>The skill ID.</p>
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
     * <p>2ktbdovwf6********cznfo</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeDataAgentSkillDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentSkillDownloadRequest self = new DescribeDataAgentSkillDownloadRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentSkillDownloadRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public DescribeDataAgentSkillDownloadRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
