// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionPrepublishRequest extends TeaModel {
    @NameInMap("IsTotalPrepublish")
    public String isTotalPrepublish;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("BarrierCount")
    public String barrierCount;

    public static CreateVersionPrepublishRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPrepublishRequest self = new CreateVersionPrepublishRequest();
        return TeaModel.build(map, self);
    }

    public CreateVersionPrepublishRequest setIsTotalPrepublish(String isTotalPrepublish) {
        this.isTotalPrepublish = isTotalPrepublish;
        return this;
    }
    public String getIsTotalPrepublish() {
        return this.isTotalPrepublish;
    }

    public CreateVersionPrepublishRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateVersionPrepublishRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public CreateVersionPrepublishRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVersionPrepublishRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateVersionPrepublishRequest setBarrierCount(String barrierCount) {
        this.barrierCount = barrierCount;
        return this;
    }
    public String getBarrierCount() {
        return this.barrierCount;
    }

}
