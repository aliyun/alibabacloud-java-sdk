// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteRpcServiceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteRpcServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRpcServiceRequest self = new DeleteRpcServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRpcServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteRpcServiceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
