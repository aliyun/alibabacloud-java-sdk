// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpgradeServiceInstanceShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static UpgradeServiceInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServiceInstanceShrinkRequest self = new UpgradeServiceInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeServiceInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeServiceInstanceShrinkRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UpgradeServiceInstanceShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpgradeServiceInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeServiceInstanceShrinkRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public UpgradeServiceInstanceShrinkRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
