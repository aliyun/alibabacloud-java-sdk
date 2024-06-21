// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneSentinelRuleFromAhasRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The namespace (environment) of Application High Availability Service (AHAS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AhasNamespace")
    public String ahasNamespace;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether AHAS is deployed in the Internet region.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAHASPublicRegion")
    public Boolean isAHASPublicRegion;

    /**
     * <p>The namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static CloneSentinelRuleFromAhasRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneSentinelRuleFromAhasRequest self = new CloneSentinelRuleFromAhasRequest();
        return TeaModel.build(map, self);
    }

    public CloneSentinelRuleFromAhasRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CloneSentinelRuleFromAhasRequest setAhasNamespace(String ahasNamespace) {
        this.ahasNamespace = ahasNamespace;
        return this;
    }
    public String getAhasNamespace() {
        return this.ahasNamespace;
    }

    public CloneSentinelRuleFromAhasRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CloneSentinelRuleFromAhasRequest setIsAHASPublicRegion(Boolean isAHASPublicRegion) {
        this.isAHASPublicRegion = isAHASPublicRegion;
        return this;
    }
    public Boolean getIsAHASPublicRegion() {
        return this.isAHASPublicRegion;
    }

    public CloneSentinelRuleFromAhasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
