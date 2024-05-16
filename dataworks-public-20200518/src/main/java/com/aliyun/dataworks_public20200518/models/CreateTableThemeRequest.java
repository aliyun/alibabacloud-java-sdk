// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableThemeRequest extends TeaModel {
    /**
     * <p>The level of the table folder. Valid values: 1 and 2. A value of 1 indicates a first-level table folder. A value of 2 indicates a second-level table folder.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <p>The name of the table folder.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the level of the parent table folder.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableThemeRequest self = new CreateTableThemeRequest();
        return TeaModel.build(map, self);
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

    public CreateTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
