// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteTriggerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public Long id;

    public static DeleteTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerRequest self = new DeleteTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteTriggerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
