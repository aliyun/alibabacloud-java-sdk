// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionStatusRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Status")
    public String status;

    public static UpdateAppVersionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionStatusRequest self = new UpdateAppVersionStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAppVersionStatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAppVersionStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
