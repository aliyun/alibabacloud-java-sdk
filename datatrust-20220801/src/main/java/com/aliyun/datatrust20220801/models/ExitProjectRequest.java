// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ExitProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static ExitProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ExitProjectRequest self = new ExitProjectRequest();
        return TeaModel.build(map, self);
    }

    public ExitProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
