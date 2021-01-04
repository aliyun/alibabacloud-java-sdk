// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyIpCnameStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Enable")
    public Boolean enable;

    public static ModifyIpCnameStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpCnameStatusRequest self = new ModifyIpCnameStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpCnameStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyIpCnameStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyIpCnameStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyIpCnameStatusRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyIpCnameStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
