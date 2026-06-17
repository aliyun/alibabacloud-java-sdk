// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventStatisticRequest extends TeaModel {
    /**
     * <p>The end time. This is a UNIX timestamp that is accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1774713600</p>
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
     * <p>52.130.200.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start time. This is a UNIX timestamp that is accurate to the second.</p>
     * 
     * <strong>example:</strong>
     * <p>1746151757</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInvadeEventStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventStatisticRequest self = new DescribeInvadeEventStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInvadeEventStatisticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInvadeEventStatisticRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInvadeEventStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
