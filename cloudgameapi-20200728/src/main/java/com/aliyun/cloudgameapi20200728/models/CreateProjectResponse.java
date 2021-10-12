// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    public static CreateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponse self = new CreateProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
