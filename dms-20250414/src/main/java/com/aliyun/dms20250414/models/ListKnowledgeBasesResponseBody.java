// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>A list of knowledge base objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<OneMetaKnowledgeBase> data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tag is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * <ul>
     * <li><p>If this parameter is empty, all results have been returned.</p>
     * </li>
     * <li><p>If a value is returned, use it in the next request to retrieve the next page of results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of knowledge bases matching the query. This feature is not currently supported and the returned value is always <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResponseBody self = new ListKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResponseBody setData(java.util.List<OneMetaKnowledgeBase> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OneMetaKnowledgeBase> getData() {
        return this.data;
    }

    public ListKnowledgeBasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListKnowledgeBasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListKnowledgeBasesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListKnowledgeBasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
