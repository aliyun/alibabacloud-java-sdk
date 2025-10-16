// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedVulnTrendRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1754878752</p>
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
     * <p>112.15.190.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>1740623016</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeUnprotectedVulnTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedVulnTrendRequest self = new DescribeUnprotectedVulnTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedVulnTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUnprotectedVulnTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUnprotectedVulnTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUnprotectedVulnTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
