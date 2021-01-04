// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateLayer4RuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("FrontPort")
    public Integer frontPort;

    @NameInMap("Rservers")
    public String rservers;

    public static UpdateLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayer4RuleRequest self = new UpdateLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLayer4RuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateLayer4RuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateLayer4RuleRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UpdateLayer4RuleRequest setFrontPort(Integer frontPort) {
        this.frontPort = frontPort;
        return this;
    }
    public Integer getFrontPort() {
        return this.frontPort;
    }

    public UpdateLayer4RuleRequest setRservers(String rservers) {
        this.rservers = rservers;
        return this;
    }
    public String getRservers() {
        return this.rservers;
    }

}
