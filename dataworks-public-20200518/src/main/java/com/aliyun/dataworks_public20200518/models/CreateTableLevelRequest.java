// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableLevelRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("LevelType")
    public Integer levelType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateTableLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableLevelRequest self = new CreateTableLevelRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableLevelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTableLevelRequest setLevelType(Integer levelType) {
        this.levelType = levelType;
        return this;
    }
    public Integer getLevelType() {
        return this.levelType;
    }

    public CreateTableLevelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableLevelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
