// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentFeatureRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

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
     * <p>The feature name. Valid values: app-agent-pilot, metric-agent, ebpf-agent, and service-check.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>metric-agent</p>
     */
    @NameInMap("FeatureName")
    public String featureName;

    /**
     * <p>The version of the feature.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.17</p>
     */
    @NameInMap("FeatureVersion")
    public String featureVersion;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable service discovery. For PodAnnotation, set the value to run or mini. For PodMonitor and ServiceMonitor, set the value to true or false.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PodAnnotation&quot;:&quot;run&quot;}</p>
     */
    @NameInMap("Values")
    public String values;

    public static UpgradeEnvironmentFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentFeatureRequest self = new UpgradeEnvironmentFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentFeatureRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UpgradeEnvironmentFeatureRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpgradeEnvironmentFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public UpgradeEnvironmentFeatureRequest setFeatureVersion(String featureVersion) {
        this.featureVersion = featureVersion;
        return this;
    }
    public String getFeatureVersion() {
        return this.featureVersion;
    }

    public UpgradeEnvironmentFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeEnvironmentFeatureRequest setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
