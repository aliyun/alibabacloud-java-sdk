// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallEnvironmentFeatureRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The metadata of the feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;continuous\&quot;:true,\&quot;dataRevision\&quot;:2}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The environment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The name of the feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>app-agent-pilot</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>metric-agent</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>metric-agent</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The version of the feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.17</p>
     */
    @NameInMap("FeatureVersion")
    public String featureVersion;

    /**
     * <p>The region ID of the feature.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
