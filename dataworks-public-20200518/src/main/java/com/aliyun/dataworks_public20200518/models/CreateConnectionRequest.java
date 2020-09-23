// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ConnectionType")
    @Validation(required = true)
    public String connectionType;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("EnvType")
    @Validation(required = true)
    public Integer envType;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateConnectionRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CreateConnectionRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateConnectionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
