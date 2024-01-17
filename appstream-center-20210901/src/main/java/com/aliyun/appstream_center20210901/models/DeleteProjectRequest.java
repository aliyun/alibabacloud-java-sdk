// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
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
