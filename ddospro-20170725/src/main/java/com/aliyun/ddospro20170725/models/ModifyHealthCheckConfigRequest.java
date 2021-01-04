// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("ConfigJson")
    public String configJson;

    @NameInMap("LbId")
    public String lbId;

    public static ModifyHealthCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigRequest self = new ModifyHealthCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyHealthCheckConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyHealthCheckConfigRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ModifyHealthCheckConfigRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public ModifyHealthCheckConfigRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

    public ModifyHealthCheckConfigRequest setLbId(String lbId) {
        this.lbId = lbId;
        return this;
    }
    public String getLbId() {
        return this.lbId;
    }

}
