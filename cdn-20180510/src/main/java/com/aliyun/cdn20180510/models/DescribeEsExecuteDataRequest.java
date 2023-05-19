// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataRequest extends TeaModel {
    /**
     * <p>The name of the chart that shows the status of the script.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The value of each time and the column of each data entry.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The column names of the chart that shows the status of the script and the time of each data entry.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEsExecuteDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExecuteDataRequest self = new DescribeEsExecuteDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEsExecuteDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEsExecuteDataRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeEsExecuteDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
