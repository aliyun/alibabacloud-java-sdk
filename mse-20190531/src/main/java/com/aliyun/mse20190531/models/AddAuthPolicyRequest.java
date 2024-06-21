// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>e9clba2xlc@***</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;all&quot;:true,&quot;black&quot;:false,&quot;appIds&quot;:[&quot;dez4qt7weh@***&quot;]}]</p>
     */
    @NameInMap("AuthRule")
    public String authRule;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthType")
    public Integer authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <strong>example:</strong>
     * <p>c19c6c500e1ff4d7abc7***</p>
     */
    @NameInMap("K8sNamespace")
    public String k8sNamespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SPRING_CLOUD</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    public static AddAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthPolicyRequest self = new AddAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthPolicyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddAuthPolicyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddAuthPolicyRequest setAuthRule(String authRule) {
        this.authRule = authRule;
        return this;
    }
    public String getAuthRule() {
        return this.authRule;
    }

    public AddAuthPolicyRequest setAuthType(Integer authType) {
        this.authType = authType;
        return this;
    }
    public Integer getAuthType() {
        return this.authType;
    }

    public AddAuthPolicyRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public AddAuthPolicyRequest setK8sNamespace(String k8sNamespace) {
        this.k8sNamespace = k8sNamespace;
        return this;
    }
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    public AddAuthPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddAuthPolicyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddAuthPolicyRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddAuthPolicyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddAuthPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
