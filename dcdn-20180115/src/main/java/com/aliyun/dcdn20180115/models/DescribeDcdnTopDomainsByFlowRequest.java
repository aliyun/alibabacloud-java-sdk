// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnTopDomainsByFlowRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnTopDomainsByFlowRequest self = new DescribeDcdnTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnTopDomainsByFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnTopDomainsByFlowRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeDcdnTopDomainsByFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
