// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsRequest extends TeaModel {
    @NameInMap("ProjectIds")
    public String projectIds;

    public static DeleteEditingProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsRequest self = new DeleteEditingProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

}
