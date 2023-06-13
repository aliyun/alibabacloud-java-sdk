// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthRule")
    public String authRule;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("Id")
    public String id;

    @NameInMap("K8sNamespace")
    public String k8sNamespace;

    @NameInMap("Name")
    public String name;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Region")
    public String region;

    @NameInMap("Source")
    public String source;

    public static UpdateAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthPolicyRequest self = new UpdateAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthPolicyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateAuthPolicyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAuthPolicyRequest setAuthRule(String authRule) {
        this.authRule = authRule;
        return this;
    }
    public String getAuthRule() {
        return this.authRule;
    }

    public UpdateAuthPolicyRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateAuthPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAuthPolicyRequest setK8sNamespace(String k8sNamespace) {
        this.k8sNamespace = k8sNamespace;
        return this;
    }
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    public UpdateAuthPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAuthPolicyRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateAuthPolicyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateAuthPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
