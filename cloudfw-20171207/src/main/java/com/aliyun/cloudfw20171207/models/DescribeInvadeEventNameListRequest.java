// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventNameListRequest extends TeaModel {
    /**
     * <p>The end time. This is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1738780437</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language type.</p>
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
     * <p>36.112.73.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The start time. This is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1757620800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInvadeEventNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventNameListRequest self = new DescribeInvadeEventNameListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventNameListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInvadeEventNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInvadeEventNameListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInvadeEventNameListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
