// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttMessageLogsRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("Mid")
    public String mid;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("Type")
    public String type;

    public static ListMqttMessageLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqttMessageLogsRequest self = new ListMqttMessageLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListMqttMessageLogsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListMqttMessageLogsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListMqttMessageLogsRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ListMqttMessageLogsRequest setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

    public ListMqttMessageLogsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListMqttMessageLogsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ListMqttMessageLogsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListMqttMessageLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
