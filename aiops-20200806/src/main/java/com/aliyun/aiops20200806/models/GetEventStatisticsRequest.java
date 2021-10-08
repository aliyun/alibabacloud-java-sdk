// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventStatisticsRequest extends TeaModel {
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Uid")
    public Long uid;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetEventStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventStatisticsRequest self = new GetEventStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetEventStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEventStatisticsRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetEventStatisticsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
