// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("DeleteVersion")
    @Validation(required = true)
    public java.util.List<Long> deleteVersion;

    public static DeleteLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionRequest self = new DeleteLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLaunchTemplateVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DeleteLaunchTemplateVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public DeleteLaunchTemplateVersionRequest setDeleteVersion(java.util.List<Long> deleteVersion) {
        this.deleteVersion = deleteVersion;
        return this;
    }
    public java.util.List<Long> getDeleteVersion() {
        return this.deleteVersion;
    }

}
