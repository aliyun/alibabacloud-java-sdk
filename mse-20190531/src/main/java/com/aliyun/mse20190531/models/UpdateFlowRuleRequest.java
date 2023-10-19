// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateFlowRuleRequest extends TeaModel {
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
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The timeout period. Unit: milliseconds. This parameter is required when the value of ControlBehavior is set to 2.</p>
     */
    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    /**
     * <p>The namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The rule ID.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The throttling threshold.</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    public static UpdateFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowRuleRequest self = new UpdateFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateFlowRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateFlowRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateFlowRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public UpdateFlowRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public UpdateFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateFlowRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateFlowRuleRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
