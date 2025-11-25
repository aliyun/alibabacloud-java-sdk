// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingRiskDomainAndIpCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1751595213</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1749434787</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeOutgoingRiskDomainAndIpCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingRiskDomainAndIpCountRequest self = new DescribeOutgoingRiskDomainAndIpCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingRiskDomainAndIpCountRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingRiskDomainAndIpCountRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
