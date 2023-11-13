// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallEnvironmentFeatureRequest extends TeaModel {
    /**
     * <p>Language,the default language is Chinese.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Config information of Feature.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>Name of Feature.</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>Version of Feature.</p>
     */
    @NameInMap("FeatureVersion")
    public String featureVersion;

    /**
     * <p>Region of Feature.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static InstallEnvironmentFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallEnvironmentFeatureRequest self = new InstallEnvironmentFeatureRequest();
        return TeaModel.build(map, self);
    }

    public InstallEnvironmentFeatureRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public InstallEnvironmentFeatureRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public InstallEnvironmentFeatureRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public InstallEnvironmentFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public InstallEnvironmentFeatureRequest setFeatureVersion(String featureVersion) {
        this.featureVersion = featureVersion;
        return this;
    }
    public String getFeatureVersion() {
        return this.featureVersion;
    }

    public InstallEnvironmentFeatureRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public InstallEnvironmentFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
