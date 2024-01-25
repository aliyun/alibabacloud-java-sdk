// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventStatisticsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Uid")
    public Long uid;

    public static GetEventStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventStatisticsRequest self = new GetEventStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetEventStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetEventStatisticsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetEventStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetEventStatisticsRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
