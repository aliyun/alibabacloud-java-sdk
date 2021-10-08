// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTrentRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("TimeType")
    public String timeType;

    @NameInMap("GranularityType")
    public String granularityType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetEventTrentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventTrentRequest self = new GetEventTrentRequest();
        return TeaModel.build(map, self);
    }

    public GetEventTrentRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetEventTrentRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventTrentRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEventTrentRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public GetEventTrentRequest setGranularityType(String granularityType) {
        this.granularityType = granularityType;
        return this;
    }
    public String getGranularityType() {
        return this.granularityType;
    }

    public GetEventTrentRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
