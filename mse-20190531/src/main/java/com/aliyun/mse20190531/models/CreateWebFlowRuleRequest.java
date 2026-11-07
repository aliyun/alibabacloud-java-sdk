// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateWebFlowRuleRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1****@c3df23522******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens of the token bucket algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Burst")
    public Integer burst;

    /**
     * <p>The flow control method. Valid values:</p>
     * <ul>
     * <li><p>0: fast failure</p>
     * </li>
     * <li><p>2: wait in queue</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    /**
     * <p>The rule status. Valid values:</p>
     * <ul>
     * <li><p>true: enabled</p>
     * </li>
     * <li><p>false: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The timeout period. Unit: milliseconds. This parameter is required if the ControlBehavior parameter is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    /**
     * <p>The threshold type. Valid values:</p>
     * <ul>
     * <li>1 (number of requests)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MetricType")
    public Integer metricType;

    /**
     * <p>The namespace</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The parameter description, which is a JSON string containing the following key-value pairs:</p>
     * <ul>
     * <li><p>parseStrategy: the parameter property (0: client IP address, 1: remote host, 2: header, 3: URL parameter)</p>
     * </li>
     * <li><p>fieldName: the header name or URL parameter name. You must specify this key only if parseStrategy is set to 2 or 3</p>
     * </li>
     * <li><p>matchStrategy: the method to match the property value. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched. Valid values: 0 (exact match), 2 (regular expression match), and 3 (substring match)</p>
     * </li>
     * <li><p>pattern: the match string. You must specify this key only if parseStrategy is set to 2 or 3 and the property value is matched</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fieldName&quot;:&quot;testKey&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;testValue&quot;}</p>
     */
    @NameInMap("ParamItem")
    public String paramItem;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The interface name: The application resources to which the rule applies. The interface name must be the same as the name on the interface details page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/flow</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>Resource mode</p>
     * <ul>
     * <li>0: resource name mode</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResourceMode")
    public Integer resourceMode;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>0: custom interface</p>
     * </li>
     * <li><p>1: WEB</p>
     * </li>
     * <li><p>2: RPC</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The length of the time window. Unit: milliseconds. The default value is 1000, which indicates 1 second.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    /**
     * <p>Threshold</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static CreateWebFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFlowRuleRequest self = new CreateWebFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateWebFlowRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateWebFlowRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateWebFlowRuleRequest setBurst(Integer burst) {
        this.burst = burst;
        return this;
    }
    public Integer getBurst() {
        return this.burst;
    }

    public CreateWebFlowRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public CreateWebFlowRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateWebFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public CreateWebFlowRuleRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public CreateWebFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateWebFlowRuleRequest setParamItem(String paramItem) {
        this.paramItem = paramItem;
        return this;
    }
    public String getParamItem() {
        return this.paramItem;
    }

    public CreateWebFlowRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWebFlowRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateWebFlowRuleRequest setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }
    public Integer getResourceMode() {
        return this.resourceMode;
    }

    public CreateWebFlowRuleRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateWebFlowRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public CreateWebFlowRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
