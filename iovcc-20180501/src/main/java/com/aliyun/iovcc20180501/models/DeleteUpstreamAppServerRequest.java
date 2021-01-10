// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppServerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public Long id;

    public static DeleteUpstreamAppServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppServerRequest self = new DeleteUpstreamAppServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppServerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteUpstreamAppServerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
