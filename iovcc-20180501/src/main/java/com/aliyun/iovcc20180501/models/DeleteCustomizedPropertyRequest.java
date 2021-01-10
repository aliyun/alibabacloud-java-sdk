// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCustomizedPropertyRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    public static DeleteCustomizedPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedPropertyRequest self = new DeleteCustomizedPropertyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedPropertyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteCustomizedPropertyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
