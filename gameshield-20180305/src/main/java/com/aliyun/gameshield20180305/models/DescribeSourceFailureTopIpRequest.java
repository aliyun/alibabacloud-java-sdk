// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTopIpRequest extends TeaModel {
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

    @NameInMap("Limit")
    public Integer limit;

    public static DescribeSourceFailureTopIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTopIpRequest self = new DescribeSourceFailureTopIpRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTopIpRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSourceFailureTopIpRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSourceFailureTopIpRequest setEsnBizId(String esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public String getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeSourceFailureTopIpRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSourceFailureTopIpRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSourceFailureTopIpRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
