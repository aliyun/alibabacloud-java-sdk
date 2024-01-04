// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallEnvironmentFeatureRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The metadata of the feature.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The name of the feature.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   app-agent-pilot</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   metric-agent</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The version of the feature.</p>
     */
    @NameInMap("FeatureVersion")
    public String featureVersion;

    /**
     * <p>The region ID of the feature.</p>
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
