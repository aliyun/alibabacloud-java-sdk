// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableLevelRequest extends TeaModel {
    /**
     * <p>The description of the table level.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the table level to be updated. You can call the ListTableLevel operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LevelId")
    public Long levelId;

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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateTableLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableLevelRequest self = new UpdateTableLevelRequest();
        return TeaModel.build(map, self);
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

    public UpdateTableLevelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
