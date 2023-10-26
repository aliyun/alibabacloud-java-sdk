// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentFeatureRequest extends TeaModel {
    @NameInMap("EnvironmentId")
    public String environmentId;

    @NameInMap("FeatureName")
    public String featureName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEnvironmentFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentFeatureRequest self = new DeleteEnvironmentFeatureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentFeatureRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DeleteEnvironmentFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public DeleteEnvironmentFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
