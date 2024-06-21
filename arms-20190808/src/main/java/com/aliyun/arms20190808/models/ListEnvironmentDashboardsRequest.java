// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentDashboardsRequest extends TeaModel {
    /**
     * <p>Name of Addon,One of AddonName and Scene must be filled in.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-java</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The ID of the environment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario of Addon. Either AddonName or Scene is required.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
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
