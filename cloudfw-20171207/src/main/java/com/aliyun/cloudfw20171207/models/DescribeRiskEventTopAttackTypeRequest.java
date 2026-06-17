// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopAttackTypeRequest extends TeaModel {
    /**
     * <p>The edition of Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BuyVersion")
    public String buyVersion;

    /**
     * <p>The traffic direction.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range for the query. The value must be a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1743387943</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>140.210.153.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start of the time range for the query. The value must be a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1670307484</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRiskEventTopAttackTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopAttackTypeRequest self = new DescribeRiskEventTopAttackTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopAttackTypeRequest setBuyVersion(String buyVersion) {
        this.buyVersion = buyVersion;
        return this;
    }
    public String getBuyVersion() {
        return this.buyVersion;
    }

    public DescribeRiskEventTopAttackTypeRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeRiskEventTopAttackTypeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventTopAttackTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventTopAttackTypeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRiskEventTopAttackTypeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
