// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateWebFlowRuleRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1****@c3df23522******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The number of additional requests allowed for burst requests. The effect is equivalent to the maximum number of tokens for the token bucket algorithm.</p>
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
     * <li><p>true (enabled)</p>
     * </li>
     * <li><p>false (disabled)</p>
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
     * <li>1: number of requests</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MetricType")
    public Integer metricType;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The parameter description item, which is a JSON string containing the following key-value pairs:</p>
     * <ul>
     * <li><p>parseStrategy: the parameter property (0: client IP address. 1: remote host. 2: header. 3: URL parameter)</p>
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
     * <p>{&quot;fieldName&quot;:&quot;key&quot;,&quot;matchStrategy&quot;:2,&quot;parseStrategy&quot;:2,&quot;pattern&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ParamItem")
    public String paramItem;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource mode. Valid values:</p>
     * <ul>
     * <li>0: resource name mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResourceMode")
    public Integer resourceMode;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The length of the time window. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("StatIntervalMs")
    public Integer statIntervalMs;

    /**
     * <p>The threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static UpdateWebFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFlowRuleRequest self = new UpdateWebFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateWebFlowRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateWebFlowRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateWebFlowRuleRequest setBurst(Integer burst) {
        this.burst = burst;
        return this;
    }
    public Integer getBurst() {
        return this.burst;
    }

    public UpdateWebFlowRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public UpdateWebFlowRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateWebFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public UpdateWebFlowRuleRequest setMetricType(Integer metricType) {
        this.metricType = metricType;
        return this;
    }
    public Integer getMetricType() {
        return this.metricType;
    }

    public UpdateWebFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateWebFlowRuleRequest setParamItem(String paramItem) {
        this.paramItem = paramItem;
        return this;
    }
    public String getParamItem() {
        return this.paramItem;
    }

    public UpdateWebFlowRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWebFlowRuleRequest setResourceMode(Integer resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }
    public Integer getResourceMode() {
        return this.resourceMode;
    }

    public UpdateWebFlowRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateWebFlowRuleRequest setStatIntervalMs(Integer statIntervalMs) {
        this.statIntervalMs = statIntervalMs;
        return this;
    }
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    public UpdateWebFlowRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
