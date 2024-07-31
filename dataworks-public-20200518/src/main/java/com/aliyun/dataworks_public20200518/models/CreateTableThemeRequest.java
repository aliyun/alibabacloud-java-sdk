// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableThemeRequest extends TeaModel {
    /**
     * <p>The level of the table theme. Valid values: 1 and 2. The value 1 indicates the first level. The value 2 indicates the second level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <p>The name of the table theme.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the level of the parent table theme.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
