// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LmActivitySessionModelList")
    public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList lmActivitySessionModelList;

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

    public static QueryUnfinishedSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessionsResponseBody self = new QueryUnfinishedSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUnfinishedSessionsResponseBody setLmActivitySessionModelList(QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList lmActivitySessionModelList) {
        this.lmActivitySessionModelList = lmActivitySessionModelList;
        return this;
    }
    public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList getLmActivitySessionModelList() {
        return this.lmActivitySessionModelList;
    }

    public QueryUnfinishedSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUnfinishedSessionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnfinishedSessionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnfinishedSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUnfinishedSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayDate")
        public String displayDate;

        @NameInMap("EndDate")
        public String endDate;

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

        public static QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel self = new QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setDisplayDate(String displayDate) {
            this.displayDate = displayDate;
            return this;
        }
        public String getDisplayDate() {
            return this.displayDate;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setLmActivityId(Long lmActivityId) {
            this.lmActivityId = lmActivityId;
            return this;
        }
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setLmSessionId(Long lmSessionId) {
            this.lmSessionId = lmSessionId;
            return this;
        }
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel setSubBizCode(String subBizCode) {
            this.subBizCode = subBizCode;
            return this;
        }
        public String getSubBizCode() {
            return this.subBizCode;
        }

    }

    public static class QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        public java.util.List<QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel> lmActivitySessionModel;

        public static QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList build(java.util.Map<String, ?> map) throws Exception {
            QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList self = new QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList();
            return TeaModel.build(map, self);
        }

        public QueryUnfinishedSessionsResponseBodyLmActivitySessionModelList setLmActivitySessionModel(java.util.List<QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel> lmActivitySessionModel) {
            this.lmActivitySessionModel = lmActivitySessionModel;
            return this;
        }
        public java.util.List<QueryUnfinishedSessionsResponseBodyLmActivitySessionModelListLmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

    }

}
