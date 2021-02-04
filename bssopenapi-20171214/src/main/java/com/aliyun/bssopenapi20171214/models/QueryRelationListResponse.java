// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryRelationListResponseData data;

    public static QueryRelationListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationListResponse self = new QueryRelationListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRelationListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRelationListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRelationListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRelationListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRelationListResponse setData(QueryRelationListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRelationListResponseData getData() {
        return this.data;
    }

    public static class QueryRelationListResponseDataFinancialRelationInfoList extends TeaModel {
        @NameInMap("RelationId")
        @Validation(required = true)
        public Long relationId;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountNickName")
        @Validation(required = true)
        public String accountNickName;

        @NameInMap("RelationType")
        @Validation(required = true)
        public String relationType;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SetupTime")
        @Validation(required = true)
        public String setupTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static QueryRelationListResponseDataFinancialRelationInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseDataFinancialRelationInfoList self = new QueryRelationListResponseDataFinancialRelationInfoList();
            return TeaModel.build(map, self);
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setAccountNickName(String accountNickName) {
            this.accountNickName = accountNickName;
            return this;
        }
        public String getAccountNickName() {
            return this.accountNickName;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setSetupTime(String setupTime) {
            this.setupTime = setupTime;
            return this;
        }
        public String getSetupTime() {
            return this.setupTime;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryRelationListResponseDataFinancialRelationInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class QueryRelationListResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("FinancialRelationInfoList")
        @Validation(required = true)
        public java.util.List<QueryRelationListResponseDataFinancialRelationInfoList> financialRelationInfoList;

        public static QueryRelationListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRelationListResponseData self = new QueryRelationListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRelationListResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryRelationListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRelationListResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryRelationListResponseData setFinancialRelationInfoList(java.util.List<QueryRelationListResponseDataFinancialRelationInfoList> financialRelationInfoList) {
            this.financialRelationInfoList = financialRelationInfoList;
            return this;
        }
        public java.util.List<QueryRelationListResponseDataFinancialRelationInfoList> getFinancialRelationInfoList() {
            return this.financialRelationInfoList;
        }

    }

}
