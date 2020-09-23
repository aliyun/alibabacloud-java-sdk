// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableLevelRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("LevelType")
    @Validation(required = true)
    public Integer levelType;

    public static ListTableLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableLevelRequest self = new ListTableLevelRequest();
        return TeaModel.build(map, self);
    }

    public ListTableLevelRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListTableLevelRequest setLevelType(Integer levelType) {
        this.levelType = levelType;
        return this;
    }
    public Integer getLevelType() {
        return this.levelType;
    }

}
