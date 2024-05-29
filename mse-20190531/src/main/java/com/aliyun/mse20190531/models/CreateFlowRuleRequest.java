// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateFlowRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The throttling effect.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   0</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    fast failure</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   2</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    in queue</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    /**
     * <p>Specifies whether to enable the rule.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The timeout period. Unit: milliseconds. This value is required if the ControlBehavior parameter is set to 2.</p>
     */
    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    /**
     * <p>The namespace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the API resource.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The throttling threshold.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    public static CreateFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRuleRequest self = new CreateFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateFlowRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateFlowRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateFlowRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public CreateFlowRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public CreateFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFlowRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateFlowRuleRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateFlowRuleRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
