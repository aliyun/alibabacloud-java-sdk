// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationProjectRequest extends TeaModel {
    @NameInMap("projectId")
    public String projectId;

    public static DeleteIndividuationProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationProjectRequest self = new DeleteIndividuationProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
