// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLogsRequest extends TeaModel {
    @NameInMap("AlarmStatus")
    public String alarmStatus;

    @NameInMap("Content")
    public String content;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Start")
    public Long start;

    public static ListLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogsRequest self = new ListLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogsRequest setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    public ListLogsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ListLogsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ListLogsRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public ListLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListLogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public ListLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLogsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListLogsRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
