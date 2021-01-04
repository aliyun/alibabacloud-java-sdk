// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainProxyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ProxyType")
    public java.util.List<String> proxyType;

    public static ModifyDomainProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainProxyRequest self = new ModifyDomainProxyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainProxyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDomainProxyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDomainProxyRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainProxyRequest setProxyType(java.util.List<String> proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public java.util.List<String> getProxyType() {
        return this.proxyType;
    }

}
