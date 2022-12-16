// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // - zh: Chinese
    // - en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // Specifies whether to enable the routing rule.
    @NameInMap("Enable")
    public Boolean enable;

    // Optional. The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The ID of the region.
    @NameInMap("Region")
    public String region;

    // The details of the routing rule.
    @NameInMap("Rules")
    public String rules;

    // The source of the routing rule.
    @NameInMap("Source")
    public String source;

    public static ApplyTagPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTagPoliciesRequest self = new ApplyTagPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTagPoliciesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ApplyTagPoliciesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyTagPoliciesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ApplyTagPoliciesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ApplyTagPoliciesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ApplyTagPoliciesRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public ApplyTagPoliciesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
