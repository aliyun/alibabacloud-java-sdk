// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteShadowSchemaRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteShadowSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShadowSchemaRequest self = new DeleteShadowSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShadowSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteShadowSchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
