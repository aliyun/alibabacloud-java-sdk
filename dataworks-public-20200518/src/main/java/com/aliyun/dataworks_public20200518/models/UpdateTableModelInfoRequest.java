// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableModelInfoRequest extends TeaModel {
    /**
     * <p>The ID of the first-level table folder.</p>
     */
    @NameInMap("FirstLevelThemeId")
    public Long firstLevelThemeId;

    /**
     * <p>The ID of the table level.</p>
     */
    @NameInMap("LevelId")
    public Long levelId;

    /**
     * <p>The type of the table level. Valid values: 1 and 2. A value of 1 indicates the logical level. A value of 2 indicates the physical level.</p>
     */
    @NameInMap("LevelType")
    public Integer levelType;

    /**
     * <p>The ID of the second-level table folder.</p>
     */
    @NameInMap("SecondLevelThemeId")
    public Long secondLevelThemeId;

    /**
     * <p>The globally unique identifier (GUID) of the table. Specify the GUID in the format of odps.{projectName}.{tableName}.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static UpdateTableModelInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableModelInfoRequest self = new UpdateTableModelInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableModelInfoRequest setFirstLevelThemeId(Long firstLevelThemeId) {
        this.firstLevelThemeId = firstLevelThemeId;
        return this;
    }
    public Long getFirstLevelThemeId() {
        return this.firstLevelThemeId;
    }

    public UpdateTableModelInfoRequest setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public UpdateTableModelInfoRequest setLevelType(Integer levelType) {
        this.levelType = levelType;
        return this;
    }
    public Integer getLevelType() {
        return this.levelType;
    }

    public UpdateTableModelInfoRequest setSecondLevelThemeId(Long secondLevelThemeId) {
        this.secondLevelThemeId = secondLevelThemeId;
        return this;
    }
    public Long getSecondLevelThemeId() {
        return this.secondLevelThemeId;
    }

    public UpdateTableModelInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
