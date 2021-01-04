// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateLayer4RulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Rules")
    public String rules;

    @NameInMap("Flush")
    public Integer flush;

    public static CreateLayer4RulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RulesRequest self = new CreateLayer4RulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateLayer4RulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateLayer4RulesRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public CreateLayer4RulesRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public CreateLayer4RulesRequest setFlush(Integer flush) {
        this.flush = flush;
        return this;
    }
    public Integer getFlush() {
        return this.flush;
    }

}
