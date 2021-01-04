// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class UpdateCcCustomedRuleRequest extends TeaModel {
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

    public static UpdateCcCustomedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcCustomedRuleRequest self = new UpdateCcCustomedRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCcCustomedRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateCcCustomedRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCcCustomedRuleRequest setMatchingRule(String matchingRule) {
        this.matchingRule = matchingRule;
        return this;
    }
    public String getMatchingRule() {
        return this.matchingRule;
    }

    public UpdateCcCustomedRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateCcCustomedRuleRequest setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
        return this;
    }
    public Integer getVisitCount() {
        return this.visitCount;
    }

    public UpdateCcCustomedRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCcCustomedRuleRequest setBlockingType(String blockingType) {
        this.blockingType = blockingType;
        return this;
    }
    public String getBlockingType() {
        return this.blockingType;
    }

    public UpdateCcCustomedRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateCcCustomedRuleRequest setBlockingTime(Integer blockingTime) {
        this.blockingTime = blockingTime;
        return this;
    }
    public Integer getBlockingTime() {
        return this.blockingTime;
    }

    public UpdateCcCustomedRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
