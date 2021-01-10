// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppKeyRelationRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteUpstreamAppKeyRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppKeyRelationRequest self = new DeleteUpstreamAppKeyRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppKeyRelationRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteUpstreamAppKeyRelationRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
