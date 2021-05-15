// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryStatementsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public QueryStatementsResponseModel model;

    public static QueryStatementsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatementsResponse self = new QueryStatementsResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatementsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatementsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatementsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatementsResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryStatementsResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryStatementsResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryStatementsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStatementsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryStatementsResponse setModel(QueryStatementsResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryStatementsResponseModel getModel() {
        return this.model;
    }

    public static class QueryStatementsResponseModelStatementList extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ModifiedDate")
        @Validation(required = true)
        public String modifiedDate;

        @NameInMap("SettleNo")
        @Validation(required = true)
        public String settleNo;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("PayeeId")
        @Validation(required = true)
        public String payeeId;

        @NameInMap("PayeeName")
        @Validation(required = true)
        public String payeeName;

        @NameInMap("PayeeAccountId")
        @Validation(required = true)
        public String payeeAccountId;

        @NameInMap("PayeeAccountName")
        @Validation(required = true)
        public String payeeAccountName;

        @NameInMap("PayeeAccountNo")
        @Validation(required = true)
        public String payeeAccountNo;

        @NameInMap("SettleAmount")
        @Validation(required = true)
        public String settleAmount;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("SettleStatus")
        @Validation(required = true)
        public String settleStatus;

        @NameInMap("StatusMessage")
        @Validation(required = true)
        public String statusMessage;

        @NameInMap("Attributes")
        @Validation(required = true)
        public String attributes;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public String extInfo;

        public static QueryStatementsResponseModelStatementList build(java.util.Map<String, ?> map) throws Exception {
            QueryStatementsResponseModelStatementList self = new QueryStatementsResponseModelStatementList();
            return TeaModel.build(map, self);
        }

        public QueryStatementsResponseModelStatementList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryStatementsResponseModelStatementList setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public QueryStatementsResponseModelStatementList setSettleNo(String settleNo) {
            this.settleNo = settleNo;
            return this;
        }
        public String getSettleNo() {
            return this.settleNo;
        }

        public QueryStatementsResponseModelStatementList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryStatementsResponseModelStatementList setPayeeId(String payeeId) {
            this.payeeId = payeeId;
            return this;
        }
        public String getPayeeId() {
            return this.payeeId;
        }

        public QueryStatementsResponseModelStatementList setPayeeName(String payeeName) {
            this.payeeName = payeeName;
            return this;
        }
        public String getPayeeName() {
            return this.payeeName;
        }

        public QueryStatementsResponseModelStatementList setPayeeAccountId(String payeeAccountId) {
            this.payeeAccountId = payeeAccountId;
            return this;
        }
        public String getPayeeAccountId() {
            return this.payeeAccountId;
        }

        public QueryStatementsResponseModelStatementList setPayeeAccountName(String payeeAccountName) {
            this.payeeAccountName = payeeAccountName;
            return this;
        }
        public String getPayeeAccountName() {
            return this.payeeAccountName;
        }

        public QueryStatementsResponseModelStatementList setPayeeAccountNo(String payeeAccountNo) {
            this.payeeAccountNo = payeeAccountNo;
            return this;
        }
        public String getPayeeAccountNo() {
            return this.payeeAccountNo;
        }

        public QueryStatementsResponseModelStatementList setSettleAmount(String settleAmount) {
            this.settleAmount = settleAmount;
            return this;
        }
        public String getSettleAmount() {
            return this.settleAmount;
        }

        public QueryStatementsResponseModelStatementList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryStatementsResponseModelStatementList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryStatementsResponseModelStatementList setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryStatementsResponseModelStatementList setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public QueryStatementsResponseModelStatementList setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public QueryStatementsResponseModelStatementList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class QueryStatementsResponseModel extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("StatementList")
        @Validation(required = true)
        public java.util.List<QueryStatementsResponseModelStatementList> statementList;

        public static QueryStatementsResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryStatementsResponseModel self = new QueryStatementsResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryStatementsResponseModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStatementsResponseModel setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryStatementsResponseModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryStatementsResponseModel setStatementList(java.util.List<QueryStatementsResponseModelStatementList> statementList) {
            this.statementList = statementList;
            return this;
        }
        public java.util.List<QueryStatementsResponseModelStatementList> getStatementList() {
            return this.statementList;
        }

    }

}
