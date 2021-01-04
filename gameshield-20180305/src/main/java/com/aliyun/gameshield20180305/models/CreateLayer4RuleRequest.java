// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("BackPort")
    public Integer backPort;

    @NameInMap("Rservers")
    public String rservers;

    public static CreateLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleRequest self = new CreateLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateLayer4RuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateLayer4RuleRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateLayer4RuleRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateLayer4RuleRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public CreateLayer4RuleRequest setBackPort(Integer backPort) {
        this.backPort = backPort;
        return this;
    }
    public Integer getBackPort() {
        return this.backPort;
    }

    public CreateLayer4RuleRequest setRservers(String rservers) {
        this.rservers = rservers;
        return this;
    }
    public String getRservers() {
        return this.rservers;
    }

}
