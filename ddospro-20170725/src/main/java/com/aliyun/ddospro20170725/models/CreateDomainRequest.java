// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Type")
    public String type;

    @NameInMap("CcEnable")
    public Boolean ccEnable;

    @NameInMap("RealServer")
    public java.util.List<String> realServer;

    @NameInMap("ProxyType")
    public java.util.List<String> proxyType;

    @NameInMap("Ips")
    public java.util.List<String> ips;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateDomainRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDomainRequest setCcEnable(Boolean ccEnable) {
        this.ccEnable = ccEnable;
        return this;
    }
    public Boolean getCcEnable() {
        return this.ccEnable;
    }

    public CreateDomainRequest setRealServer(java.util.List<String> realServer) {
        this.realServer = realServer;
        return this;
    }
    public java.util.List<String> getRealServer() {
        return this.realServer;
    }

    public CreateDomainRequest setProxyType(java.util.List<String> proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public java.util.List<String> getProxyType() {
        return this.proxyType;
    }

    public CreateDomainRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

}
