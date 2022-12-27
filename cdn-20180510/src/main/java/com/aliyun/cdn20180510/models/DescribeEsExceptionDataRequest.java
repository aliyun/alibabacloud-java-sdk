// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExceptionDataRequest extends TeaModel {
    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the script that you want to query. You can call the [DescribeCdnDomainConfigs](~~90924~~) operation to query script IDs.
    @NameInMap("RuleId")
    public String ruleId;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEsExceptionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExceptionDataRequest self = new DescribeEsExceptionDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEsExceptionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEsExceptionDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEsExceptionDataRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeEsExceptionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
