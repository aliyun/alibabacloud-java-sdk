// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsRequest extends TeaModel {
    // 幂等标识
    @NameInMap("clientToken")
    public String clientToken;

    // 触发时间
    @NameInMap("createTime")
    public String createTime;

    // 事件告警内容
    @NameInMap("events")
    public java.util.List<String> events;

    // 事件id
    @NameInMap("incidentId")
    public Long incidentId;

    // 事件标题
    @NameInMap("incidentTitle")
    public String incidentTitle;

    // 关联服务id
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    public static GetSimilarIncidentStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarIncidentStatisticsRequest self = new GetSimilarIncidentStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetSimilarIncidentStatisticsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSimilarIncidentStatisticsRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSimilarIncidentStatisticsRequest setEvents(java.util.List<String> events) {
        this.events = events;
        return this;
    }
    public java.util.List<String> getEvents() {
        return this.events;
    }

    public GetSimilarIncidentStatisticsRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public GetSimilarIncidentStatisticsRequest setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
        return this;
    }
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

    public GetSimilarIncidentStatisticsRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

}
