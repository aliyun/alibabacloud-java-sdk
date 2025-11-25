// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAppRequest extends TeaModel {
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyVersion")
    public String buyVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735784888</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>182.150.22.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRiskEventTopAttackAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAppRequest self = new DescribeRiskEventTopAttackAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAppRequest setAttackApp(java.util.List<String> attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    public DescribeRiskEventTopAttackAppRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeRiskEventTopAttackAppRequest setBuyVersion(String buyVersion) {
        this.buyVersion = buyVersion;
        return this;
    }
    public String getBuyVersion() {
        return this.buyVersion;
    }

    public DescribeRiskEventTopAttackAppRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventTopAttackAppRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventTopAttackAppRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRiskEventTopAttackAppRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
