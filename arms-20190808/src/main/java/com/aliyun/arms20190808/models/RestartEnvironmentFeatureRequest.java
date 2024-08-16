// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RestartEnvironmentFeatureRequest extends TeaModel {
    /**
     * <p>The ID of the environment.</p>
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
     * <p>The region ID. Default value: cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RestartEnvironmentFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartEnvironmentFeatureRequest self = new RestartEnvironmentFeatureRequest();
        return TeaModel.build(map, self);
    }

    public RestartEnvironmentFeatureRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public RestartEnvironmentFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public RestartEnvironmentFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
