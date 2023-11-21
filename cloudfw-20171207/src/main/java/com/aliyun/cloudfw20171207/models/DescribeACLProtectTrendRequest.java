// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeACLProtectTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLProtectTrendRequest self = new DescribeACLProtectTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeACLProtectTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeACLProtectTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeACLProtectTrendRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeACLProtectTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
