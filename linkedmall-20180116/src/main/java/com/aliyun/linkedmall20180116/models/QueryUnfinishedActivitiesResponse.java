// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedActivitiesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("LmActivityModelExtList")
    @Validation(required = true)
    public QueryUnfinishedActivitiesResponseLmActivityModelExtList lmActivityModelExtList;

    public static QueryUnfinishedActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedActivitiesResponse self = new QueryUnfinishedActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedActivitiesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedActivitiesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedActivitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnfinishedActivitiesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnfinishedActivitiesResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnfinishedActivitiesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnfinishedActivitiesResponse setLmActivityModelExtList(QueryUnfinishedActivitiesResponseLmActivityModelExtList lmActivityModelExtList) {
        this.lmActivityModelExtList = lmActivityModelExtList;
        return this;
    }
    public QueryUnfinishedActivitiesResponseLmActivityModelExtList getLmActivityModelExtList() {
        return this.lmActivityModelExtList;
    }

    public static class QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel extends TeaModel {
        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("LmSessionId")
        @Validation(required = true)
        public Long lmSessionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("DisplayDate")
        @Validation(required = true)
        public String displayDate;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.Map<String, ?> extInfo;

        public static QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel self = new QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

    }

    public static class QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        @Validation(required = true)
        public java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels self = new QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels setLmActivitySessionModel(java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

    public static class QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext extends TeaModel {
        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("ActivityPicUrl")
        @Validation(required = true)
        public String activityPicUrl;

        @NameInMap("LmActivitySessionModels")
        @Validation(required = true)
        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels lmActivitySessionModels;

        public static QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext self = new QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setActivityPicUrl(String activityPicUrl) {
            this.activityPicUrl = activityPicUrl;
            return this;
        }
        public String getActivityPicUrl() {
            return this.activityPicUrl;
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext setLmActivitySessionModels(QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels lmActivitySessionModels) {
            this.lmActivitySessionModels = lmActivitySessionModels;
            return this;
        }
        public QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

    }

    public static class QueryUnfinishedActivitiesResponseLmActivityModelExtList extends TeaModel {
        @NameInMap("LmActivityModelV2Ext")
        @Validation(required = true)
        public java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext> lmActivityModelV2Ext;

        public static QueryUnfinishedActivitiesResponseLmActivityModelExtList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseLmActivityModelExtList self = new QueryUnfinishedActivitiesResponseLmActivityModelExtList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseLmActivityModelExtList setLmActivityModelV2Ext(java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext> lmActivityModelV2Ext) {
            this.lmActivityModelV2Ext = lmActivityModelV2Ext;
            return this;
        }
        public java.util.List<QueryUnfinishedActivitiesResponseLmActivityModelExtListLmActivityModelV2Ext> getLmActivityModelV2Ext() {
            return this.lmActivityModelV2Ext;
        }

    }

}
