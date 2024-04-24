// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneSentinelRuleFromAhasRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AhasNamespace")
    public String ahasNamespace;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("IsAHASPublicRegion")
    public Boolean isAHASPublicRegion;

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
