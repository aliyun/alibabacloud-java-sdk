// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableLevelRequest extends TeaModel {
    /**
     * <p>The description of the table level.</p>
     * 
     * <strong>example:</strong>
     * <p>level description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the table level. You can call the ListTableLevel operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LevelId")
    public Long levelId;

    /**
     * <p>The table level type. Valid values: 1 and 2. The value 1 indicates the logical level. The value 2 indicates the physical level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LevelType")
    public Integer levelType;

    /**
     * <p>The name of the table level.</p>
     * 
     * <strong>example:</strong>
     * <p>level name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
