// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdatePortRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("RealServerList")
    public String realServerList;

    @NameInMap("Ip")
    public String ip;

    public static UpdatePortRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortRuleRequest self = new UpdatePortRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePortRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdatePortRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdatePortRuleRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public UpdatePortRuleRequest setRealServerList(String realServerList) {
        this.realServerList = realServerList;
        return this;
    }
    public String getRealServerList() {
        return this.realServerList;
    }

    public UpdatePortRuleRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
