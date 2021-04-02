// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableThemeRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Level")
    @Validation(required = true)
    public Integer level;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("ParentId")
    public Long parentId;

    public static CreateTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableThemeRequest self = new CreateTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateTableThemeRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public CreateTableThemeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableThemeRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
