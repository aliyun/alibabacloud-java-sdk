// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventTrentRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GranularityType")
    public String granularityType;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TimeType")
    public String timeType;

    @NameInMap("Uid")
    public Long uid;

    public static GetEventTrentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventTrentRequest self = new GetEventTrentRequest();
        return TeaModel.build(map, self);
    }

    public GetEventTrentRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public GetEventTrentRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventTrentRequest setTimeType(String timeType) {
        this.timeType = timeType;
        return this;
    }
    public String getTimeType() {
        return this.timeType;
    }

    public GetEventTrentRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
