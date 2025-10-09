// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineRouteResponseBody extends TeaModel {
    /**
     * <p>Bypass mode. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Bypass")
    public String bypass;

    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816******</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type to query. Valid values:</p>
     * <ul>
     * <li>global: global configurations.</li>
     * <li>rule: queries rule configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The exception origin fetch switch. After you turn on this switch, if a function exception occurs, such as CPU usage exceeding the upper limit, requests are sent back to the origin. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Fallback")
    public String fallback;

    /**
     * <p>The configuration mode. Valid values: Valid values:</p>
     * <ul>
     * <li>simple</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RouteEnable")
    public String routeEnable;

    /**
     * <p>The route name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_route</p>
     */
    @NameInMap("RouteName")
    public String routeName;

    /**
     * <p>The function name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-routine1</p>
     */
    @NameInMap("RoutineName")
    public String routineName;

    /**
     * <p>The rule content.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The order in which the rule is executed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetRoutineRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineRouteResponseBody self = new GetRoutineRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineRouteResponseBody setBypass(String bypass) {
        this.bypass = bypass;
        return this;
    }
    public String getBypass() {
        return this.bypass;
    }

    public GetRoutineRouteResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetRoutineRouteResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetRoutineRouteResponseBody setFallback(String fallback) {
        this.fallback = fallback;
        return this;
    }
    public String getFallback() {
        return this.fallback;
    }

    public GetRoutineRouteResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public GetRoutineRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoutineRouteResponseBody setRouteEnable(String routeEnable) {
        this.routeEnable = routeEnable;
        return this;
    }
    public String getRouteEnable() {
        return this.routeEnable;
    }

    public GetRoutineRouteResponseBody setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public GetRoutineRouteResponseBody setRoutineName(String routineName) {
        this.routineName = routineName;
        return this;
    }
    public String getRoutineName() {
        return this.routineName;
    }

    public GetRoutineRouteResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetRoutineRouteResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetRoutineRouteResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
