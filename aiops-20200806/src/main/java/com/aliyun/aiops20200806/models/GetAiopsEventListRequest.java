// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAiopsEventListRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EventType")
    public Integer eventType;

    @NameInMap("EventUniqueId")
    public String eventUniqueId;

    @NameInMap("FeedbackStatus")
    public Integer feedbackStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PredictionState")
    public Integer predictionState;

    @NameInMap("Severity")
    public Integer severity;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Uid")
    public Long uid;

    public static GetAiopsEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiopsEventListRequest self = new GetAiopsEventListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiopsEventListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetAiopsEventListRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public GetAiopsEventListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiopsEventListRequest setEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }
    public Integer getEventType() {
        return this.eventType;
    }

    public GetAiopsEventListRequest setEventUniqueId(String eventUniqueId) {
        this.eventUniqueId = eventUniqueId;
        return this;
    }
    public String getEventUniqueId() {
        return this.eventUniqueId;
    }

    public GetAiopsEventListRequest setFeedbackStatus(Integer feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
        return this;
    }
    public Integer getFeedbackStatus() {
        return this.feedbackStatus;
    }

    public GetAiopsEventListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAiopsEventListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAiopsEventListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiopsEventListRequest setPredictionState(Integer predictionState) {
        this.predictionState = predictionState;
        return this;
    }
    public Integer getPredictionState() {
        return this.predictionState;
    }

    public GetAiopsEventListRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

    public GetAiopsEventListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAiopsEventListRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
