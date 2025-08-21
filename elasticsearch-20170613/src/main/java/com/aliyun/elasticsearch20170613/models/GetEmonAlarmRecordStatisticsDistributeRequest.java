// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonAlarmRecordStatisticsDistributeRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("timeEnd")
    public Long timeEnd;

    @NameInMap("timeStart")
    public Long timeStart;

    public static GetEmonAlarmRecordStatisticsDistributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmonAlarmRecordStatisticsDistributeRequest self = new GetEmonAlarmRecordStatisticsDistributeRequest();
        return TeaModel.build(map, self);
    }

    public GetEmonAlarmRecordStatisticsDistributeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public GetEmonAlarmRecordStatisticsDistributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetEmonAlarmRecordStatisticsDistributeRequest setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    public GetEmonAlarmRecordStatisticsDistributeRequest setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public Long getTimeStart() {
        return this.timeStart;
    }

}
