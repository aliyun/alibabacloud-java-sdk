// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppId")
    @Deprecated
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("Rules")
    public String rules;

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

    public ApplyTagPoliciesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApplyTagPoliciesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ApplyTagPoliciesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
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
