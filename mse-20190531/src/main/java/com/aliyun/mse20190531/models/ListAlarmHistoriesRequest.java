// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesRequest extends TeaModel {
    @NameInMap("AlarmMseType")
    public String alarmMseType;

    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlarmHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesRequest self = new ListAlarmHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesRequest setAlarmMseType(String alarmMseType) {
        this.alarmMseType = alarmMseType;
        return this;
    }
    public String getAlarmMseType() {
        return this.alarmMseType;
    }

    public ListAlarmHistoriesRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public ListAlarmHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlarmHistoriesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAlarmHistoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmHistoriesRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListAlarmHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
