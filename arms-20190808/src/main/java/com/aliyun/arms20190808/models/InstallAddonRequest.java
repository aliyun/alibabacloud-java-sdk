// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallAddonRequest extends TeaModel {
    /**
     * <p>Version of Addon.</p>
     */
    @NameInMap("AddonVersion")
    public String addonVersion;

    /**
     * <p>Locale, the default is Chinese zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Whether to test run. The default value is false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>Name of Addon.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The release name after installation, if not specified, generates the default rule name.</p>
     */
    @NameInMap("ReleaseName")
    public String releaseName;

    /**
     * <p>Config information.</p>
     */
    @NameInMap("Values")
    public String values;

    public static InstallAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAddonRequest self = new InstallAddonRequest();
        return TeaModel.build(map, self);
    }

    public InstallAddonRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public InstallAddonRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public InstallAddonRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public InstallAddonRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public InstallAddonRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InstallAddonRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallAddonRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

    public InstallAddonRequest setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
