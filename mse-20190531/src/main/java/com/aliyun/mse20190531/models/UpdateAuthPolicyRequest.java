// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese, and the value en-US indicates English.</p>
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
     * <p>abcde@12345</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The content of the service authentication rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;all\&quot;:true,\&quot;appIds\&quot;:[\&quot;f6xqzbao96@4adfaf3c92c947a\&quot;],\&quot;black\&quot;:false}]</p>
     */
    @NameInMap("AuthRule")
    public String authRule;

    /**
     * <p>Specifies whether to enable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>432</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The namespace ID of the Kubernetes cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c19c6c500e1ff4d7abc7bed9b8236***</p>
     */
    @NameInMap("K8sNamespace")
    public String k8sNamespace;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Protocol Type. Valid values:</p>
     * <ul>
     * <li><p><strong>SPRING_CLOUD</strong>.</p>
     * </li>
     * <li><p><strong>DUBBO</strong>.</p>
     * </li>
     * <li><p><strong>istio</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SPRING_CLOUD</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The service source that the application accesses.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
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
