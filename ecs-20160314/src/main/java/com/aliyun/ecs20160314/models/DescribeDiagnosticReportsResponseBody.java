// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Reports")
    public Reports reports;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiagnosticReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportsResponseBody self = new DescribeDiagnosticReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiagnosticReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnosticReportsResponseBody setReports(Reports reports) {
        this.reports = reports;
        return this;
    }
    public Reports getReports() {
        return this.reports;
    }

    public DescribeDiagnosticReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Parameter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Parameter build(java.util.Map<String, ?> map) throws Exception {
            Parameter self = new Parameter();
            return TeaModel.build(map, self);
        }

        public Parameter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Parameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Parameters extends TeaModel {
        @NameInMap("Parameter")
        public java.util.List<Parameter> parameter;

        public static Parameters build(java.util.Map<String, ?> map) throws Exception {
            Parameters self = new Parameters();
            return TeaModel.build(map, self);
        }

        public Parameters setParameter(java.util.List<Parameter> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.List<Parameter> getParameter() {
            return this.parameter;
        }

    }

    public static class RecommendedAction extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("Parameters")
        public Parameters parameters;

        @NameInMap("Url")
        public String url;

        public static RecommendedAction build(java.util.Map<String, ?> map) throws Exception {
            RecommendedAction self = new RecommendedAction();
            return TeaModel.build(map, self);
        }

        public RecommendedAction setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public RecommendedAction setParameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public Parameters getParameters() {
            return this.parameters;
        }

        public RecommendedAction setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RecommendedActions extends TeaModel {
        @NameInMap("RecommendedAction")
        public java.util.List<RecommendedAction> recommendedAction;

        public static RecommendedActions build(java.util.Map<String, ?> map) throws Exception {
            RecommendedActions self = new RecommendedActions();
            return TeaModel.build(map, self);
        }

        public RecommendedActions setRecommendedAction(java.util.List<RecommendedAction> recommendedAction) {
            this.recommendedAction = recommendedAction;
            return this;
        }
        public java.util.List<RecommendedAction> getRecommendedAction() {
            return this.recommendedAction;
        }

    }

    public static class Issue extends TeaModel {
        @NameInMap("IssueCategory")
        public String issueCategory;

        @NameInMap("IssueCode")
        public String issueCode;

        @NameInMap("Message")
        public String message;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("RecommendedActions")
        public RecommendedActions recommendedActions;

        @NameInMap("Severity")
        public String severity;

        public static Issue build(java.util.Map<String, ?> map) throws Exception {
            Issue self = new Issue();
            return TeaModel.build(map, self);
        }

        public Issue setIssueCategory(String issueCategory) {
            this.issueCategory = issueCategory;
            return this;
        }
        public String getIssueCategory() {
            return this.issueCategory;
        }

        public Issue setIssueCode(String issueCode) {
            this.issueCode = issueCode;
            return this;
        }
        public String getIssueCode() {
            return this.issueCode;
        }

        public Issue setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Issue setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public Issue setRecommendedActions(RecommendedActions recommendedActions) {
            this.recommendedActions = recommendedActions;
            return this;
        }
        public RecommendedActions getRecommendedActions() {
            return this.recommendedActions;
        }

        public Issue setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

    }

    public static class Issues extends TeaModel {
        @NameInMap("Issue")
        public java.util.List<Issue> issue;

        public static Issues build(java.util.Map<String, ?> map) throws Exception {
            Issues self = new Issues();
            return TeaModel.build(map, self);
        }

        public Issues setIssue(java.util.List<Issue> issue) {
            this.issue = issue;
            return this;
        }
        public java.util.List<Issue> getIssue() {
            return this.issue;
        }

    }

    public static class ItemData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ItemData build(java.util.Map<String, ?> map) throws Exception {
            ItemData self = new ItemData();
            return TeaModel.build(map, self);
        }

        public ItemData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ItemData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ItemDatas extends TeaModel {
        @NameInMap("ItemData")
        public java.util.List<ItemData> itemData;

        public static ItemDatas build(java.util.Map<String, ?> map) throws Exception {
            ItemDatas self = new ItemDatas();
            return TeaModel.build(map, self);
        }

        public ItemDatas setItemData(java.util.List<ItemData> itemData) {
            this.itemData = itemData;
            return this;
        }
        public java.util.List<ItemData> getItemData() {
            return this.itemData;
        }

    }

    public static class Item extends TeaModel {
        @NameInMap("ItemCategory")
        public String itemCategory;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("ItemDatas")
        public ItemDatas itemDatas;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Status")
        public String status;

        public static Item build(java.util.Map<String, ?> map) throws Exception {
            Item self = new Item();
            return TeaModel.build(map, self);
        }

        public Item setItemCategory(String itemCategory) {
            this.itemCategory = itemCategory;
            return this;
        }
        public String getItemCategory() {
            return this.itemCategory;
        }

        public Item setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public Item setItemDatas(ItemDatas itemDatas) {
            this.itemDatas = itemDatas;
            return this;
        }
        public ItemDatas getItemDatas() {
            return this.itemDatas;
        }

        public Item setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public Item setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public Item setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class Items extends TeaModel {
        @NameInMap("Item")
        public java.util.List<Item> item;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setItem(java.util.List<Item> item) {
            this.item = item;
            return this;
        }
        public java.util.List<Item> getItem() {
            return this.item;
        }

    }

    public static class RecentEvent extends TeaModel {
        @NameInMap("EventID")
        public String eventID;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("PublishTime")
        public String publishTime;

        public static RecentEvent build(java.util.Map<String, ?> map) throws Exception {
            RecentEvent self = new RecentEvent();
            return TeaModel.build(map, self);
        }

        public RecentEvent setEventID(String eventID) {
            this.eventID = eventID;
            return this;
        }
        public String getEventID() {
            return this.eventID;
        }

        public RecentEvent setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public RecentEvent setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

    }

    public static class RecentEvents extends TeaModel {
        @NameInMap("RecentEvent")
        public java.util.List<RecentEvent> recentEvent;

        public static RecentEvents build(java.util.Map<String, ?> map) throws Exception {
            RecentEvents self = new RecentEvents();
            return TeaModel.build(map, self);
        }

        public RecentEvents setRecentEvent(java.util.List<RecentEvent> recentEvent) {
            this.recentEvent = recentEvent;
            return this;
        }
        public java.util.List<RecentEvent> getRecentEvent() {
            return this.recentEvent;
        }

    }

    public static class Report extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiagnosticCategory")
        public String diagnosticCategory;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("InvokeSystem")
        public String invokeSystem;

        @NameInMap("IssueCategoryId")
        public String issueCategoryId;

        @NameInMap("Issues")
        public Issues issues;

        @NameInMap("Items")
        public Items items;

        @NameInMap("OfflineDiagReportStatus")
        public String offlineDiagReportStatus;

        @NameInMap("PePassword")
        public String pePassword;

        @NameInMap("RecentEvents")
        public RecentEvents recentEvents;

        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static Report build(java.util.Map<String, ?> map) throws Exception {
            Report self = new Report();
            return TeaModel.build(map, self);
        }

        public Report setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public Report setDiagnosticCategory(String diagnosticCategory) {
            this.diagnosticCategory = diagnosticCategory;
            return this;
        }
        public String getDiagnosticCategory() {
            return this.diagnosticCategory;
        }

        public Report setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public Report setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public Report setInvokeSystem(String invokeSystem) {
            this.invokeSystem = invokeSystem;
            return this;
        }
        public String getInvokeSystem() {
            return this.invokeSystem;
        }

        public Report setIssueCategoryId(String issueCategoryId) {
            this.issueCategoryId = issueCategoryId;
            return this;
        }
        public String getIssueCategoryId() {
            return this.issueCategoryId;
        }

        public Report setIssues(Issues issues) {
            this.issues = issues;
            return this;
        }
        public Issues getIssues() {
            return this.issues;
        }

        public Report setItems(Items items) {
            this.items = items;
            return this;
        }
        public Items getItems() {
            return this.items;
        }

        public Report setOfflineDiagReportStatus(String offlineDiagReportStatus) {
            this.offlineDiagReportStatus = offlineDiagReportStatus;
            return this;
        }
        public String getOfflineDiagReportStatus() {
            return this.offlineDiagReportStatus;
        }

        public Report setPePassword(String pePassword) {
            this.pePassword = pePassword;
            return this;
        }
        public String getPePassword() {
            return this.pePassword;
        }

        public Report setRecentEvents(RecentEvents recentEvents) {
            this.recentEvents = recentEvents;
            return this;
        }
        public RecentEvents getRecentEvents() {
            return this.recentEvents;
        }

        public Report setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public Report setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public Report setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public Report setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public Report setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public Report setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class Reports extends TeaModel {
        @NameInMap("Report")
        public java.util.List<Report> report;

        public static Reports build(java.util.Map<String, ?> map) throws Exception {
            Reports self = new Reports();
            return TeaModel.build(map, self);
        }

        public Reports setReport(java.util.List<Report> report) {
            this.report = report;
            return this;
        }
        public java.util.List<Report> getReport() {
            return this.report;
        }

    }

}
