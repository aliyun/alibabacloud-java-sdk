// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreatePortRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("BackPort")
    public Integer backPort;

    @NameInMap("ProxyType")
    public String proxyType;

    @NameInMap("RealServerList")
    public String realServerList;

    @NameInMap("Ip")
    public String ip;

    public static CreatePortRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRuleRequest self = new CreatePortRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePortRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreatePortRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePortRuleRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public CreatePortRuleRequest setBackPort(Integer backPort) {
        this.backPort = backPort;
        return this;
    }
    public Integer getBackPort() {
        return this.backPort;
    }

    public CreatePortRuleRequest setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public CreatePortRuleRequest setRealServerList(String realServerList) {
        this.realServerList = realServerList;
        return this;
    }
    public String getRealServerList() {
        return this.realServerList;
    }

    public CreatePortRuleRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
