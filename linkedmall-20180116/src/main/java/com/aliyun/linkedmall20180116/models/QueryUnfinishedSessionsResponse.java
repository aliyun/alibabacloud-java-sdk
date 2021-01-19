// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessionsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("LmActivitySessionModelList")
    @Validation(required = true)
    public QueryUnfinishedSessionsResponseLmActivitySessionModelList lmActivitySessionModelList;

    public static QueryUnfinishedSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessionsResponse self = new QueryUnfinishedSessionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedSessionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedSessionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnfinishedSessionsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUnfinishedSessionsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnfinishedSessionsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnfinishedSessionsResponse setLmActivitySessionModelList(QueryUnfinishedSessionsResponseLmActivitySessionModelList lmActivitySessionModelList) {
        this.lmActivitySessionModelList = lmActivitySessionModelList;
        return this;
    }
    public QueryUnfinishedSessionsResponseLmActivitySessionModelList getLmActivitySessionModelList() {
        return this.lmActivitySessionModelList;
    }

    public static class QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel extends TeaModel {
        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("SubBizCode")
        @Validation(required = true)
        public String subBizCode;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("LmActivityId")
        @Validation(required = true)
        public Long lmActivityId;

        @NameInMap("LmSessionId")
        @Validation(required = true)
        public Long lmSessionId;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("DisplayDate")
        @Validation(required = true)
        public String displayDate;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        public static QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel self = new QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

    public static class QueryUnfinishedSessionsResponseLmActivitySessionModelList extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        @Validation(required = true)
        public java.util.List<QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedSessionsResponseLmActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessionsResponseLmActivitySessionModelList self = new QueryUnfinishedSessionsResponseLmActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessionsResponseLmActivitySessionModelList setLmActivitySessionModel(java.util.List<QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedSessionsResponseLmActivitySessionModelListLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

}
