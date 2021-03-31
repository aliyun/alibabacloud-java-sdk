// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelRequest extends TeaModel {
    @NameInMap("LevelId")
    public Long levelId;

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
