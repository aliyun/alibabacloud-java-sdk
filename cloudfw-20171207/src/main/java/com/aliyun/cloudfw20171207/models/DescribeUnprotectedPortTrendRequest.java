// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedPortTrendRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1751210395</p>
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
     * <p>61.155.60.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1655778046</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeUnprotectedPortTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedPortTrendRequest self = new DescribeUnprotectedPortTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedPortTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUnprotectedPortTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUnprotectedPortTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUnprotectedPortTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
