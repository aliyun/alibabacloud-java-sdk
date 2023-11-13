// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentFeatureRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("EnvironmentId")
    public String environmentId;

    @NameInMap("FeatureName")
    public String featureName;

    @NameInMap("FeatureVersion")
    public String featureVersion;

    @NameInMap("RegionId")
    public String regionId;

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
