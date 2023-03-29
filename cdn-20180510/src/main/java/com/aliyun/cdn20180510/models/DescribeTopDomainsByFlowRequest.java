// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeTopDomainsByFlowRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of domain names to query. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>>  Set StartTime to UTC time in the yyyy-MM-ddTHH:mm:ssZ format. For example, if the local time is 00:00, June 1, 2021, set StartTime to 2021-05-31T16:00:00Z.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopDomainsByFlowRequest self = new DescribeTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopDomainsByFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopDomainsByFlowRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeTopDomainsByFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
