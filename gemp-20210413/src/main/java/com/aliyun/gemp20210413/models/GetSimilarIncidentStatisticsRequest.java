// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSimilarIncidentStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7C56D225-7C34-40BB-9624-C8BA449260E6</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-09 09:09:09</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("events")
    public java.util.List<String> events;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx事件</p>
     */
    @NameInMap("incidentTitle")
    public String incidentTitle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
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
