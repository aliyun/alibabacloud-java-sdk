// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeStrategyPlaybookRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDisposeStrategyPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeStrategyPlaybookRequest self = new DescribeDisposeStrategyPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeStrategyPlaybookRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDisposeStrategyPlaybookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDisposeStrategyPlaybookRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
