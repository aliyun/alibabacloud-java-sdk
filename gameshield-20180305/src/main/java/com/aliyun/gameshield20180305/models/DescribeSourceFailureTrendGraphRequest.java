// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTrendGraphRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public String esnBizId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Interval")
    public Integer interval;

    public static DescribeSourceFailureTrendGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTrendGraphRequest self = new DescribeSourceFailureTrendGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTrendGraphRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSourceFailureTrendGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSourceFailureTrendGraphRequest setEsnBizId(String esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public String getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeSourceFailureTrendGraphRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSourceFailureTrendGraphRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSourceFailureTrendGraphRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

}
