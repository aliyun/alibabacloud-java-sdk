// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisMaxQpsRequest extends TeaModel {
    /**
     * <p>The end time of the query. Use the UNIX timestamp format. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1619798400</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The start time of the query. Use the UNIX timestamp format. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1622476799</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAttackAnalysisMaxQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisMaxQpsRequest self = new DescribeAttackAnalysisMaxQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisMaxQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAttackAnalysisMaxQpsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeAttackAnalysisMaxQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
