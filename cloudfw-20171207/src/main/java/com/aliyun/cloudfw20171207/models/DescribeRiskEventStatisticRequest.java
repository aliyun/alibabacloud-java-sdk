// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventStatisticRequest extends TeaModel {
    /**
     * <p>The attacked application.</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>The attack type of the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: anomalous connection</p>
     * </li>
     * <li><p><strong>2</strong>: command execution</p>
     * </li>
     * <li><p><strong>3</strong>: brute-force attack</p>
     * </li>
     * <li><p><strong>4</strong>: scanning</p>
     * </li>
     * <li><p><strong>5</strong>: other</p>
     * </li>
     * <li><p><strong>6</strong>: information leakage</p>
     * </li>
     * <li><p><strong>7</strong>: DoS attack</p>
     * </li>
     * <li><p><strong>8</strong>: overflow attack</p>
     * </li>
     * <li><p><strong>9</strong>: web attack</p>
     * </li>
     * <li><p><strong>10</strong>: trojan backdoor</p>
     * </li>
     * <li><p><strong>11</strong>: virus and worm</p>
     * </li>
     * <li><p><strong>12</strong>: mining</p>
     * </li>
     * <li><p><strong>13</strong>: reverse shell</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all attack types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The end time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408267</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the response.</p>
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
     * <p>218.76.30.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRiskEventStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventStatisticRequest self = new DescribeRiskEventStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventStatisticRequest setAttackApp(java.util.List<String> attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    public DescribeRiskEventStatisticRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeRiskEventStatisticRequest setBuyVersion(String buyVersion) {
        this.buyVersion = buyVersion;
        return this;
    }
    public String getBuyVersion() {
        return this.buyVersion;
    }

    public DescribeRiskEventStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventStatisticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventStatisticRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRiskEventStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
