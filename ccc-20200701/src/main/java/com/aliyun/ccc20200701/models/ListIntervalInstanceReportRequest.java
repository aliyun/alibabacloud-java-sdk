// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalInstanceReportRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListIntervalInstanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalInstanceReportRequest self = new ListIntervalInstanceReportRequest();
        return TeaModel.build(map, self);
    }

    public ListIntervalInstanceReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListIntervalInstanceReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIntervalInstanceReportRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ListIntervalInstanceReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
