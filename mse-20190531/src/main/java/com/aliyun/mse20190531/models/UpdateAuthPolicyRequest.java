// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese, and the value en-US indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The content of the service authentication rule.</p>
     */
    @NameInMap("AuthRule")
    public String authRule;

    /**
     * <p>Specifies whether to enable the rule.</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the ACK cluster namespace.</p>
     */
    @NameInMap("K8sNamespace")
    public String k8sNamespace;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol type. Valid values:</p>
     * <br>
     * <p>*   **SPRING_CLOUD**</p>
     * <p>*   **DUBBO**</p>
     * <p>*   **istio**</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The source for application access.</p>
     */
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
