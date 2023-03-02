// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableLevelRequest extends TeaModel {
    /**
     * <p>The description of the table level.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the table level. Valid values: 1 and 2. A value of 1 indicates the logical level. A value of 2 indicates the physical level.</p>
     */
    @NameInMap("LevelType")
    public Integer levelType;

    /**
     * <p>The name of the table level.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
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
