// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentFeatureRequest extends TeaModel {
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
     * <p>The region ID. Valid values: cn-beijing and cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
