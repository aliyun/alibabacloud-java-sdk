// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DeletePortRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("Ip")
    public String ip;

    public static DeletePortRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePortRuleRequest self = new DeletePortRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeletePortRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeletePortRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeletePortRuleRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public DeletePortRuleRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
