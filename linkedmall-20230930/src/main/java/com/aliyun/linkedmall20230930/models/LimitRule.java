// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LimitRule extends TeaModel {
    @NameInMap("beginTime")
    public Long beginTime;

    @NameInMap("condcase")
    public String condcase;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("limitNum")
    public Integer limitNum;

    @NameInMap("ruleType")
    public String ruleType;

    public static LimitRule build(java.util.Map<String, ?> map) throws Exception {
        LimitRule self = new LimitRule();
        return TeaModel.build(map, self);
    }

    public LimitRule setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public LimitRule setCondcase(String condcase) {
        this.condcase = condcase;
        return this;
    }
    public String getCondcase() {
        return this.condcase;
    }

    public LimitRule setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public LimitRule setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }
    public Integer getLimitNum() {
        return this.limitNum;
    }

    public LimitRule setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
