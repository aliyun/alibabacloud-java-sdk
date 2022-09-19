// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteSyncSqlResponseBody extends TeaModel {
    @NameInMap("CostTime")
    public Long costTime;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("ResultDataList")
    public java.util.List<String> resultDataList;

    @NameInMap("ResultHeaders")
    public java.util.List<String> resultHeaders;

    @NameInMap("ResultPageNumber")
    public Long resultPageNumber;

    @NameInMap("ResultPageSize")
    public Long resultPageSize;

    @NameInMap("ResultRows")
    public Long resultRows;

    @NameInMap("ResultTotalCount")
    public Long resultTotalCount;

    @NameInMap("SQL")
    public String SQL;

    @NameInMap("SQLErrorCode")
    public String SQLErrorCode;

    @NameInMap("SQLErrorMessage")
    public String SQLErrorMessage;

    @NameInMap("SQLStatus")
    public Boolean SQLStatus;

    @NameInMap("SQLType")
    public String SQLType;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteSyncSqlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSyncSqlResponseBody self = new ExecuteSyncSqlResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteSyncSqlResponseBody setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public ExecuteSyncSqlResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ExecuteSyncSqlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteSyncSqlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteSyncSqlResponseBody setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public ExecuteSyncSqlResponseBody setResultDataList(java.util.List<String> resultDataList) {
        this.resultDataList = resultDataList;
        return this;
    }
    public java.util.List<String> getResultDataList() {
        return this.resultDataList;
    }

    public ExecuteSyncSqlResponseBody setResultHeaders(java.util.List<String> resultHeaders) {
        this.resultHeaders = resultHeaders;
        return this;
    }
    public java.util.List<String> getResultHeaders() {
        return this.resultHeaders;
    }

    public ExecuteSyncSqlResponseBody setResultPageNumber(Long resultPageNumber) {
        this.resultPageNumber = resultPageNumber;
        return this;
    }
    public Long getResultPageNumber() {
        return this.resultPageNumber;
    }

    public ExecuteSyncSqlResponseBody setResultPageSize(Long resultPageSize) {
        this.resultPageSize = resultPageSize;
        return this;
    }
    public Long getResultPageSize() {
        return this.resultPageSize;
    }

    public ExecuteSyncSqlResponseBody setResultRows(Long resultRows) {
        this.resultRows = resultRows;
        return this;
    }
    public Long getResultRows() {
        return this.resultRows;
    }

    public ExecuteSyncSqlResponseBody setResultTotalCount(Long resultTotalCount) {
        this.resultTotalCount = resultTotalCount;
        return this;
    }
    public Long getResultTotalCount() {
        return this.resultTotalCount;
    }

    public ExecuteSyncSqlResponseBody setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

    public ExecuteSyncSqlResponseBody setSQLErrorCode(String SQLErrorCode) {
        this.SQLErrorCode = SQLErrorCode;
        return this;
    }
    public String getSQLErrorCode() {
        return this.SQLErrorCode;
    }

    public ExecuteSyncSqlResponseBody setSQLErrorMessage(String SQLErrorMessage) {
        this.SQLErrorMessage = SQLErrorMessage;
        return this;
    }
    public String getSQLErrorMessage() {
        return this.SQLErrorMessage;
    }

    public ExecuteSyncSqlResponseBody setSQLStatus(Boolean SQLStatus) {
        this.SQLStatus = SQLStatus;
        return this;
    }
    public Boolean getSQLStatus() {
        return this.SQLStatus;
    }

    public ExecuteSyncSqlResponseBody setSQLType(String SQLType) {
        this.SQLType = SQLType;
        return this;
    }
    public String getSQLType() {
        return this.SQLType;
    }

    public ExecuteSyncSqlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
