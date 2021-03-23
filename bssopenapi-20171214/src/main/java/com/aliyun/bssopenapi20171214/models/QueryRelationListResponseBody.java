// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryRelationListResponseBodyData data;

    public static QueryRelationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationListResponseBody self = new QueryRelationListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRelationListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRelationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRelationListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRelationListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRelationListResponseBody setData(QueryRelationListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRelationListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryRelationListResponseBodyDataFinancialRelationInfoList extends TeaModel {
        @NameInMap("RelationId")
        public Long relationId;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountNickName")
        public String accountNickName;

        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("State")
        public String state;

        @NameInMap("SetupTime")
        public String setupTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        public static QueryRelationListResponseBodyDataFinancialRelationInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseBodyDataFinancialRelationInfoList self = new QueryRelationListResponseBodyDataFinancialRelationInfoList();
            return TeaModel.build(map, self);
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
            return this;
        }
        public String getAccountNickName() {
            return this.accountNickName;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setSetupTime(String setupTime) {
            this.setupTime = setupTime;
            return this;
        }
        public String getSetupTime() {
            return this.setupTime;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class QueryRelationListResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("FinancialRelationInfoList")
        public java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> financialRelationInfoList;

        public static QueryRelationListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseBodyData self = new QueryRelationListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRelationListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryRelationListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRelationListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryRelationListResponseBodyData setFinancialRelationInfoList(java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> financialRelationInfoList) {
            this.financialRelationInfoList = financialRelationInfoList;
            return this;
        }
        public java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> getFinancialRelationInfoList() {
            return this.financialRelationInfoList;
        }

    }

}
