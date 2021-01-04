// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppDailySdkVersionsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnAppId")
    public String esnAppId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeAppDailySdkVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDailySdkVersionsRequest self = new DescribeAppDailySdkVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppDailySdkVersionsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAppDailySdkVersionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAppDailySdkVersionsRequest setEsnAppId(String esnAppId) {
        this.esnAppId = esnAppId;
        return this;
    }
    public String getEsnAppId() {
        return this.esnAppId;
    }

    public DescribeAppDailySdkVersionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAppDailySdkVersionsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
