// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5pohqu3gd@xxx</p>
     */
    @NameInMap("AppId")
    @Deprecated
    public String appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to enable the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The Microservices Engine (MSE) namespace to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Optional. The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>12233****</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The details of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;blue&quot;: { # Tag key. &quot;rate&quot;: 20, # Rate. A value of 20 indicates that 20% of the traffic is routed to the node identified by the tag. &quot;name&quot;: &quot;luoye-route-test&quot;, # Routing rule name. &quot;carryData&quot;: false, # Specifies whether to enable pass-through. This parameter is applicable to end-to-end canary release. &quot;rules&quot;: { # Rule information. &quot;dubbo&quot;: [{ # Dubbo rule. The system also supports Spring Cloud and Istio rule. &quot;serviceName&quot;: &quot;com.taobao.hsf.common.DemoService&quot;, # Service name (operation name). &quot;group&quot;: &quot;&quot;, # Group name. &quot;version&quot;: &quot;&quot;, # Service version. &quot;methodName&quot;: &quot;sayHello&quot;, # Method name. &quot;condition&quot;: &quot;AND&quot;, # Logical operator used by the following items. Valid values: AND and OR. &quot;argumentItems&quot;: [{ # Array of rule details. &quot;index&quot;: 0, # Index field. &quot;expr&quot;: &quot;&quot;, # Expression. Its details is described below. &quot;operator&quot;: &quot;rawvalue&quot;, # The comparison mode. A value of rawvalue indicates direct comparison. A value of mode indicates the modulo operation. A value of list indicates using a whitelist. &quot;value&quot;: &quot;jim&quot;, # Base value. The value obtained by the expression will be compared with this value. If operator is set to list, separate the items specified for this parameter with commas (,). Example: 1,2,3. &quot;cond&quot;: &quot;==&quot; # Comparison operator. Valid values: &gt;=, &lt;=, &gt;, &lt;, and ==. }] }] } }, &quot;_base&quot;: { # Another tag key. &quot;rate&quot;: 80 # Rate. A value of 20 indicates that 20% of the traffic is routed to the node identified by the tag. } }</p>
     */
    @NameInMap("Rules")
    public java.util.Map<String, RulesValue> rules;

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

    public ApplyTagPoliciesRequest setRules(java.util.Map<String, RulesValue> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.Map<String, RulesValue> getRules() {
        return this.rules;
    }

}
