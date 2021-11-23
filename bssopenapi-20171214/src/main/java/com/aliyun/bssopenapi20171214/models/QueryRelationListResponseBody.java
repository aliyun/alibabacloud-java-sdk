// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRelationListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public QueryRelationListResponseBody setData(QueryRelationListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRelationListResponseBodyData getData() {
        return this.data;
    }

    public QueryRelationListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QueryRelationListResponseBodyDataFinancialRelationInfoList extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountNickName")
        public String accountNickName;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("RelationId")
        public Long relationId;

        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("SetupTime")
        public String setupTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        public static QueryRelationListResponseBodyDataFinancialRelationInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseBodyDataFinancialRelationInfoList self = new QueryRelationListResponseBodyDataFinancialRelationInfoList();
            return TeaModel.build(map, self);
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

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
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

        public QueryRelationListResponseBodyDataFinancialRelationInfoList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryRelationListResponseBodyData extends TeaModel {
        @NameInMap("FinancialRelationInfoList")
        public java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> financialRelationInfoList;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryRelationListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseBodyData self = new QueryRelationListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRelationListResponseBodyData setFinancialRelationInfoList(java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> financialRelationInfoList) {
            this.financialRelationInfoList = financialRelationInfoList;
            return this;
        }
        public java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> getFinancialRelationInfoList() {
            return this.financialRelationInfoList;
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

    }

}
