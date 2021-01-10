// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionStatusRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Status")
    public String status;

    public static UpdateOsVersionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionStatusRequest self = new UpdateOsVersionStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOsVersionStatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOsVersionStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
