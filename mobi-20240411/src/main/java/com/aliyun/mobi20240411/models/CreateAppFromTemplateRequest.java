// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mobi20240411.models;

import com.aliyun.tea.*;

public class CreateAppFromTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;bailianapp&quot;,&quot;name&quot;:&quot;rag&quot;,&quot;actualParameter&quot;:&quot;11&quot;}]</p>
     */
    @NameInMap("ActualParameters")
    public String actualParameters;

    @NameInMap("ConnectionsContent")
    public String connectionsContent;

    @NameInMap("DatabasesContent")
    public String databasesContent;

    @NameInMap("Description")
    public String description;

    @NameInMap("From")
    public String from;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Icon")
    public String icon;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c892729-9950-4353-8146-33542b869e01</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>Web</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("VariablesContent")
    public String variablesContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731664463*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateAppFromTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppFromTemplateRequest self = new CreateAppFromTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppFromTemplateRequest setActualParameters(String actualParameters) {
        this.actualParameters = actualParameters;
        return this;
    }
    public String getActualParameters() {
        return this.actualParameters;
    }

    public CreateAppFromTemplateRequest setConnectionsContent(String connectionsContent) {
        this.connectionsContent = connectionsContent;
        return this;
    }
    public String getConnectionsContent() {
        return this.connectionsContent;
    }

    public CreateAppFromTemplateRequest setDatabasesContent(String databasesContent) {
        this.databasesContent = databasesContent;
        return this;
    }
    public String getDatabasesContent() {
        return this.databasesContent;
    }

    public CreateAppFromTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppFromTemplateRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public CreateAppFromTemplateRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateAppFromTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppFromTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateAppFromTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAppFromTemplateRequest setVariablesContent(String variablesContent) {
        this.variablesContent = variablesContent;
        return this;
    }
    public String getVariablesContent() {
        return this.variablesContent;
    }

    public CreateAppFromTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
