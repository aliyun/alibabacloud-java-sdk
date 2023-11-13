// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeAddonReleaseRequest extends TeaModel {
    /**
     * <p>Version of Addon.</p>
     */
    @NameInMap("AddonVersion")
    public String addonVersion;

    /**
     * <p>Whether to pre-check this request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of Release.</p>
     */
    @NameInMap("ReleaseName")
    public String releaseName;

    /**
     * <p>Metadata information.</p>
     */
    @NameInMap("Values")
    public String values;

    public static UpgradeAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeAddonReleaseRequest self = new UpgradeAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeAddonReleaseRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public UpgradeAddonReleaseRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpgradeAddonReleaseRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpgradeAddonReleaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeAddonReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public UpgradeAddonReleaseRequest setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
