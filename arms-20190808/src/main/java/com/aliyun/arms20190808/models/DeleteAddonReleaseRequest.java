// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseRequest extends TeaModel {
    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>Whether to be forcibly deleted. The default value is false.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Name of Release.</p>
     */
    @NameInMap("ReleaseName")
    public String releaseName;

    public static DeleteAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddonReleaseRequest self = new DeleteAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAddonReleaseRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DeleteAddonReleaseRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteAddonReleaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAddonReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
