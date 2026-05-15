// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentKnowledgeBaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-HZ-rtl5lwx********q32d3ux</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2dl4opo5vbh*******frxfsmw</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDataAgentKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentKnowledgeBaseRequest self = new DeleteDataAgentKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentKnowledgeBaseRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public DeleteDataAgentKnowledgeBaseRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public DeleteDataAgentKnowledgeBaseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
