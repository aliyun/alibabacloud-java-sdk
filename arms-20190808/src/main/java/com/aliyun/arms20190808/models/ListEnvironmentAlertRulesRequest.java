// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentAlertRulesRequest extends TeaModel {
    /**
     * <p>The name of the add-on. You must specify AddonName or Scene.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("AddonName")
    public String addonName;

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
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario of the add-on. You must specify AddonName or Scene.</p>
     * 
     * <strong>example:</strong>
     * <p>database</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static ListEnvironmentAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentAlertRulesRequest self = new ListEnvironmentAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentAlertRulesRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListEnvironmentAlertRulesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvironmentAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnvironmentAlertRulesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
