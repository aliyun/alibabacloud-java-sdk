// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("DefaultVersionNumber")
    @Validation(required = true)
    public Long defaultVersionNumber;

    public static ModifyLaunchTemplateDefaultVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionRequest self = new ModifyLaunchTemplateDefaultVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLaunchTemplateDefaultVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setDefaultVersionNumber(Long defaultVersionNumber) {
        this.defaultVersionNumber = defaultVersionNumber;
        return this;
    }
    public Long getDefaultVersionNumber() {
        return this.defaultVersionNumber;
    }

}
