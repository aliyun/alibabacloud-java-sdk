// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionPrepublishActiveStatusRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PrepublishId")
    public String prepublishId;

    @NameInMap("IsActive")
    public String isActive;

    public static UpdateVersionPrepublishActiveStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionPrepublishActiveStatusRequest self = new UpdateVersionPrepublishActiveStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVersionPrepublishActiveStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateVersionPrepublishActiveStatusRequest setPrepublishId(String prepublishId) {
        this.prepublishId = prepublishId;
        return this;
    }
    public String getPrepublishId() {
        return this.prepublishId;
    }

    public UpdateVersionPrepublishActiveStatusRequest setIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }
    public String getIsActive() {
        return this.isActive;
    }

}
