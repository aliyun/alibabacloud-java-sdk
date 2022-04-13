// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryStatementsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryStatementsResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryStatementsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatementsResponseBody self = new QueryStatementsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatementsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatementsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryStatementsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatementsResponseBody setModel(QueryStatementsResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryStatementsResponseBodyModel getModel() {
        return this.model;
    }

    public QueryStatementsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatementsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryStatementsResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryStatementsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStatementsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryStatementsResponseBodyModelStatementList extends TeaModel {
        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("KpNoGenerateTime")
        public String kpNoGenerateTime;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        @NameInMap("PayeeAccountId")
        public String payeeAccountId;

        @NameInMap("PayeeAccountName")
        public String payeeAccountName;

        @NameInMap("PayeeAccountNo")
        public String payeeAccountNo;

        @NameInMap("PayeeId")
        public String payeeId;

        @NameInMap("PayeeName")
        public String payeeName;

        @NameInMap("SettleAmount")
        public String settleAmount;

        @NameInMap("SettleNo")
        public String settleNo;

        @NameInMap("SettleStatus")
        public String settleStatus;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("TenantId")
        public String tenantId;

        public static QueryStatementsResponseBodyModelStatementList build(java.util.Map<String, ?> map) throws Exception {
            QueryStatementsResponseBodyModelStatementList self = new QueryStatementsResponseBodyModelStatementList();
            return TeaModel.build(map, self);
        }

        public QueryStatementsResponseBodyModelStatementList setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public QueryStatementsResponseBodyModelStatementList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryStatementsResponseBodyModelStatementList setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryStatementsResponseBodyModelStatementList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryStatementsResponseBodyModelStatementList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryStatementsResponseBodyModelStatementList setKpNoGenerateTime(String kpNoGenerateTime) {
            this.kpNoGenerateTime = kpNoGenerateTime;
            return this;
        }
        public String getKpNoGenerateTime() {
            return this.kpNoGenerateTime;
        }

        public QueryStatementsResponseBodyModelStatementList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public QueryStatementsResponseBodyModelStatementList setPayeeAccountId(String payeeAccountId) {
            this.payeeAccountId = payeeAccountId;
            return this;
        }
        public String getPayeeAccountId() {
            return this.payeeAccountId;
        }

        public QueryStatementsResponseBodyModelStatementList setPayeeAccountName(String payeeAccountName) {
            this.payeeAccountName = payeeAccountName;
            return this;
        }
        public String getPayeeAccountName() {
            return this.payeeAccountName;
        }

        public QueryStatementsResponseBodyModelStatementList setPayeeAccountNo(String payeeAccountNo) {
            this.payeeAccountNo = payeeAccountNo;
            return this;
        }
        public String getPayeeAccountNo() {
            return this.payeeAccountNo;
        }

        public QueryStatementsResponseBodyModelStatementList setPayeeId(String payeeId) {
            this.payeeId = payeeId;
            return this;
        }
        public String getPayeeId() {
            return this.payeeId;
        }

        public QueryStatementsResponseBodyModelStatementList setPayeeName(String payeeName) {
            this.payeeName = payeeName;
            return this;
        }
        public String getPayeeName() {
            return this.payeeName;
        }

        public QueryStatementsResponseBodyModelStatementList setSettleAmount(String settleAmount) {
            this.settleAmount = settleAmount;
            return this;
        }
        public String getSettleAmount() {
            return this.settleAmount;
        }

        public QueryStatementsResponseBodyModelStatementList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryStatementsResponseBodyModelStatementList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryStatementsResponseBodyModelStatementList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryStatementsResponseBodyModelStatementList setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public QueryStatementsResponseBodyModelStatementList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryStatementsResponseBodyModel extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("StatementList")
        public java.util.List<QueryStatementsResponseBodyModelStatementList> statementList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryStatementsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryStatementsResponseBodyModel self = new QueryStatementsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryStatementsResponseBodyModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryStatementsResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStatementsResponseBodyModel setStatementList(java.util.List<QueryStatementsResponseBodyModelStatementList> statementList) {
            this.statementList = statementList;
            return this;
        }
        public java.util.List<QueryStatementsResponseBodyModelStatementList> getStatementList() {
            return this.statementList;
        }

        public QueryStatementsResponseBodyModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
