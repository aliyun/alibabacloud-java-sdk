// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateTransmitLineRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Type")
    public String type;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Ips")
    public java.util.List<String> ips;

    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    public static CreateTransmitLineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransmitLineRequest self = new CreateTransmitLineRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransmitLineRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateTransmitLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTransmitLineRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateTransmitLineRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateTransmitLineRequest setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public CreateTransmitLineRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

}
