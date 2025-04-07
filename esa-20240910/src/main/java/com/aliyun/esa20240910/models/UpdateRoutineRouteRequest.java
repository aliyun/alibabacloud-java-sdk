// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineRouteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Bypass")
    public String bypass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RouteEnable")
    public String routeEnable;

    /**
     * <strong>example:</strong>
     * <p>test_route</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    /**
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateRoutineRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineRouteRequest self = new UpdateRoutineRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineRouteRequest setBypass(String bypass) {
        this.bypass = bypass;
        return this;
    }
    public String getBypass() {
        return this.bypass;
    }

    public UpdateRoutineRouteRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateRoutineRouteRequest setRouteEnable(String routeEnable) {
        this.routeEnable = routeEnable;
        return this;
    }
    public String getRouteEnable() {
        return this.routeEnable;
    }

    public UpdateRoutineRouteRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public UpdateRoutineRouteRequest setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public UpdateRoutineRouteRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateRoutineRouteRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateRoutineRouteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
