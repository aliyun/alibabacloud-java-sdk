// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableLevelRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("LevelType")
    public Integer levelType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("LevelId")
    @Validation(required = true)
    public Long levelId;

    public static UpdateTableLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableLevelRequest self = new UpdateTableLevelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableLevelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateTableLevelRequest setLevelType(Integer levelType) {
        this.levelType = levelType;
        return this;
    }
    public Integer getLevelType() {
        return this.levelType;
    }

    public UpdateTableLevelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTableLevelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTableLevelRequest setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

}
