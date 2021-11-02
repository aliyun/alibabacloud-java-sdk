// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedActivitiesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LmActivityModelExtList")
    public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList lmActivityModelExtList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryUnfinishedActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedActivitiesResponseBody self = new QueryUnfinishedActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedActivitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedActivitiesResponseBody setLmActivityModelExtList(QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList lmActivityModelExtList) {
        this.lmActivityModelExtList = lmActivityModelExtList;
        return this;
    }
    public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList getLmActivityModelExtList() {
        return this.lmActivityModelExtList;
    }

    public QueryUnfinishedActivitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedActivitiesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnfinishedActivitiesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnfinishedActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnfinishedActivitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayDate")
        public String displayDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("LmSessionId")
        public Long lmSessionId;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("SubBizCode")
        public String subBizCode;

        public static QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel self = new QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        public java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels self = new QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels setLmActivitySessionModel(java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModelsLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

    public static class QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext extends TeaModel {
        @NameInMap("ActivityPicUrl")
        public String activityPicUrl;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("LmActivityId")
        public Long lmActivityId;

        @NameInMap("LmActivitySessionModels")
        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels lmActivitySessionModels;

        @NameInMap("Name")
        public String name;

        @NameInMap("StartDate")
        public String startDate;

        public static QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext self = new QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setActivityPicUrl(String activityPicUrl) {
            this.activityPicUrl = activityPicUrl;
            return this;
        }
        public String getActivityPicUrl() {
            return this.activityPicUrl;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setLmActivitySessionModels(QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels lmActivitySessionModels) {
            this.lmActivitySessionModels = lmActivitySessionModels;
            return this;
        }
        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2ExtLmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList extends TeaModel {
        @NameInMap("LmActivityModelV2Ext")
        public java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext> lmActivityModelV2Ext;

        public static QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList self = new QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedActivitiesResponseBodyLmActivityModelExtList setLmActivityModelV2Ext(java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext> lmActivityModelV2Ext) {
            this.lmActivityModelV2Ext = lmActivityModelV2Ext;
            return this;
        }
        public java.util.List<QueryUnfinishedActivitiesResponseBodyLmActivityModelExtListLmActivityModelV2Ext> getLmActivityModelV2Ext() {
            return this.lmActivityModelV2Ext;
        }

    }

}
