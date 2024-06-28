// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryRelationListResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7FC5D662-37FD-40A6-85B1-33442D815184</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1851253838840762</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>caiwuyun_test4</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test4</p>
         */
        @NameInMap("AccountNickName")
        public String accountNickName;

        /**
         * <p>The type of the account. Valid values: MASTER and MEMBER.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The time when the relationship became invalid. If no value is returned, the relationship is still valid.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-08T15:12Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>51463</p>
         */
        @NameInMap("RelationId")
        public Long relationId;

        /**
         * <p>The type of the relationship. Valid values: FinancialManagement and FinancialTrusteeship.</p>
         * 
         * <strong>example:</strong>
         * <p>FinancialManagement</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The time when the relationship was established. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. Example: 2016-05-23T12:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-02T15:12Z</p>
         */
        @NameInMap("SetupTime")
        public String setupTime;

        /**
         * <p>The time when the relationship became valid. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. Example: 2016-05-23T12:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-02T15:12Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the relationship. One of the enumeration members of the RelationshipStatusEnum data type is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RELATED</p>
         */
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
        /**
         * <p>The relationships.</p>
         */
        @NameInMap("FinancialRelationInfoList")
        public java.util.List<QueryRelationListResponseBodyDataFinancialRelationInfoList> financialRelationInfoList;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
