// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesRequest extends TeaModel {
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
    public String appId;

    /**
     * <p>Specifies whether to enable the routing rule.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

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
    public String rules;

    /**
     * <p>The service source.</p>
     */
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
