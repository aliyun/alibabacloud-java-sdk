// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Content")
    public String content;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SubType")
    public String subType;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateConnectionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConnectionRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public CreateConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConnectionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateConnectionRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
