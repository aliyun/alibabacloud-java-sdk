// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelRequest extends TeaModel {
    /**
     * <p>The ID of the table level to be deleted. You can call the ListTableLevel operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LevelId")
    public Long levelId;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteTableLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableLevelRequest self = new DeleteTableLevelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableLevelRequest setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public DeleteTableLevelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
