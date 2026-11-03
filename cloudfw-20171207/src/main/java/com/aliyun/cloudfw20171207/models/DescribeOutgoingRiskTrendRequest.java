// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskTrendRequest extends TeaModel {
    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1755051062</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language type for receiving messages.</p>
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
     * <p>219.145.94.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1733882648</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOutgoingRiskTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskTrendRequest self = new DescribeOutgoingRiskTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingRiskTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingRiskTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingRiskTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
