// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentDashboardsRequest extends TeaModel {
    /**
     * <p>Name of Addon.AddonName and Scene are required.</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The ID of the environment instance.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Scene of Addon.AddonName and Scene are required</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static ListEnvironmentDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDashboardsRequest self = new ListEnvironmentDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDashboardsRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListEnvironmentDashboardsRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvironmentDashboardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnvironmentDashboardsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
