// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ConvertToFEEditingProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static ConvertToFEEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertToFEEditingProjectRequest self = new ConvertToFEEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public ConvertToFEEditingProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
