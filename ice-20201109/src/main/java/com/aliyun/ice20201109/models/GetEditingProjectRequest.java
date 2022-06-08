// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectRequest extends TeaModel {
    // 云剪辑工程ID
    @NameInMap("ProjectId")
    public String projectId;

    public static GetEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectRequest self = new GetEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
