// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    @Deprecated
    public String appId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to enable the routing rule.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The Microservices Engine (MSE) namespace to which the application belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. The ID of the namespace.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The details of the routing rule.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    public static ApplyTagPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTagPoliciesShrinkRequest self = new ApplyTagPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTagPoliciesShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ApplyTagPoliciesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyTagPoliciesShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApplyTagPoliciesShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ApplyTagPoliciesShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ApplyTagPoliciesShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ApplyTagPoliciesShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ApplyTagPoliciesShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

}
