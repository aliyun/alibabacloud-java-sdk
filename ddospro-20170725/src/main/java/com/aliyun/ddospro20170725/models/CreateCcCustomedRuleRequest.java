// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateCcCustomedRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MatchingRule")
    public String matchingRule;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("VisitCount")
    public Integer visitCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("BlockingType")
    public String blockingType;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("BlockingTime")
    public Integer blockingTime;

    @NameInMap("Uri")
    public String uri;

    public static CreateCcCustomedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCcCustomedRuleRequest self = new CreateCcCustomedRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCcCustomedRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateCcCustomedRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCcCustomedRuleRequest setMatchingRule(String matchingRule) {
        this.matchingRule = matchingRule;
        return this;
    }
    public String getMatchingRule() {
        return this.matchingRule;
    }

    public CreateCcCustomedRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCcCustomedRuleRequest setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
        return this;
    }
    public Integer getVisitCount() {
        return this.visitCount;
    }

    public CreateCcCustomedRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCcCustomedRuleRequest setBlockingType(String blockingType) {
        this.blockingType = blockingType;
        return this;
    }
    public String getBlockingType() {
        return this.blockingType;
    }

    public CreateCcCustomedRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateCcCustomedRuleRequest setBlockingTime(Integer blockingTime) {
        this.blockingTime = blockingTime;
        return this;
    }
    public Integer getBlockingTime() {
        return this.blockingTime;
    }

    public CreateCcCustomedRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
