// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateProjectConfigRequest extends TeaModel {
    @NameInMap("IsOpenBatchSQL")
    public Boolean isOpenBatchSQL;

    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectConfigRequest self = new UpdateProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectConfigRequest setIsOpenBatchSQL(Boolean isOpenBatchSQL) {
        this.isOpenBatchSQL = isOpenBatchSQL;
        return this;
    }
    public Boolean getIsOpenBatchSQL() {
        return this.isOpenBatchSQL;
    }

    public UpdateProjectConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
