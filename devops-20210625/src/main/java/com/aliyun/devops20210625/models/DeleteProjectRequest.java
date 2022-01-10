// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    // 项目id
    @NameInMap("projectId")
    public String projectId;

    public static DeleteProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRequest self = new DeleteProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
