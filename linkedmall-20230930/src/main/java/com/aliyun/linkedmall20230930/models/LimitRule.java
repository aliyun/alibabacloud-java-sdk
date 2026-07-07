// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LimitRule extends TeaModel {
    /**
     * <p>Start time of validity</p>
     * <blockquote>
     * <p>UNIX timestamp in milliseconds</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1724947200000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>Period condition</p>
     * <blockquote>
     * <p>This field applies only when ruleType is UpperNumberPerUserPeriod.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("condcase")
    public String condcase;

    /**
     * <p>End time of validity</p>
     * <blockquote>
     * <p>UNIX timestamp in milliseconds</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1724947200000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Purchase limit quantity</p>
     * <blockquote>
     * <p>If multiple purchase limit rules are active at the same time, the final limit is the minimum value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("limitNum")
    public Integer limitNum;

    /**
     * <p>Purchase limit type</p>
     * 
     * <strong>example:</strong>
     * <p>UpperNumberPerUser</p>
     */
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
