// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAccessPageRequest extends TeaModel {
    @NameInMap("AccessPageName")
    public String accessPageName;

    @NameInMap("CloudEnvId")
    public String cloudEnvId;

    @NameInMap("EffectTime")
    public Integer effectTime;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Unit")
    public String unit;

    public static CreateAccessPageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPageRequest self = new CreateAccessPageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessPageRequest setAccessPageName(String accessPageName) {
        this.accessPageName = accessPageName;
        return this;
    }
    public String getAccessPageName() {
        return this.accessPageName;
    }

    public CreateAccessPageRequest setCloudEnvId(String cloudEnvId) {
        this.cloudEnvId = cloudEnvId;
        return this;
    }
    public String getCloudEnvId() {
        return this.cloudEnvId;
    }

    public CreateAccessPageRequest setEffectTime(Integer effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public Integer getEffectTime() {
        return this.effectTime;
    }

    public CreateAccessPageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAccessPageRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAccessPageRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
