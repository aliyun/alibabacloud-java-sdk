// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteProjectAppRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppId")
    public String appId;

    public static DeleteProjectAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectAppRequest self = new DeleteProjectAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectAppRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteProjectAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
