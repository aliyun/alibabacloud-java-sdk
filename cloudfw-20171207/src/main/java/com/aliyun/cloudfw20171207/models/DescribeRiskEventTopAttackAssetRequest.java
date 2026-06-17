// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackAssetRequest extends TeaModel {
    /**
     * <p>The list of attack applications.</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>The type of the attack application.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The edition of Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyVersion")
    public String buyVersion;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1742955867</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>125.33.253.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1754273436</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRiskEventTopAttackAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackAssetRequest self = new DescribeRiskEventTopAttackAssetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackAssetRequest setAttackApp(java.util.List<String> attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    public DescribeRiskEventTopAttackAssetRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeRiskEventTopAttackAssetRequest setBuyVersion(String buyVersion) {
        this.buyVersion = buyVersion;
        return this;
    }
    public String getBuyVersion() {
        return this.buyVersion;
    }

    public DescribeRiskEventTopAttackAssetRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventTopAttackAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventTopAttackAssetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRiskEventTopAttackAssetRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
