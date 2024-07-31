// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelRequest extends TeaModel {
    /**
     * <p>The ID of the table level that you want to delete. You can call the ListTableLevel operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("LevelId")
    public Long levelId;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
