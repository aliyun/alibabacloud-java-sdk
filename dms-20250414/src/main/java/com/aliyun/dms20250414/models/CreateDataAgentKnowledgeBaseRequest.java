// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentKnowledgeBaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>KnowledgeBaseTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>kb-HZ-ra99********ss0xp1bku</p>
     */
    @NameInMap("FromKbUuid")
    public String fromKbUuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeBaseTest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8i5tw7omgaax*********n909jid</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentKnowledgeBaseRequest self = new CreateDataAgentKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentKnowledgeBaseRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateDataAgentKnowledgeBaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataAgentKnowledgeBaseRequest setFromKbUuid(String fromKbUuid) {
        this.fromKbUuid = fromKbUuid;
        return this;
    }
    public String getFromKbUuid() {
        return this.fromKbUuid;
    }

    public CreateDataAgentKnowledgeBaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataAgentKnowledgeBaseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
