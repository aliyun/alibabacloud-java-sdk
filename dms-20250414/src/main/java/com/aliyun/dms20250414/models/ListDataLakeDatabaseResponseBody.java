// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeDatabaseResponseBody extends TeaModel {
    /**
     * <p>The list of databases.</p>
     */
    @NameInMap("DatabaseList")
    public java.util.List<DLDatabase> databaseList;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of entries returned per page. This parameter is used with \<code>NextToken\\</code> for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. If this parameter is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2g****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLakeDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeDatabaseResponseBody self = new ListDataLakeDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakeDatabaseResponseBody setDatabaseList(java.util.List<DLDatabase> databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public java.util.List<DLDatabase> getDatabaseList() {
        return this.databaseList;
    }

    public ListDataLakeDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataLakeDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataLakeDatabaseResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakeDatabaseResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakeDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLakeDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
