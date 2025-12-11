// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDocumentRetrieveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ElementScope")
    public String elementScope;

    /**
     * <strong>example:</strong>
     * <p>2025-07-03</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>国务院办公室</p>
     */
    @NameInMap("Office")
    public String office;

    /**
     * <strong>example:</strong>
     * <p>检索Query</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>北京市</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>2025-10-10</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubContentType")
    public String subContentType;

    /**
     * <strong>example:</strong>
     * <p>国防和交流合作事务</p>
     */
    @NameInMap("SubjectClassify")
    public String subjectClassify;

    /**
     * <strong>example:</strong>
     * <p>宁民规〔2020〕5号</p>
     */
    @NameInMap("WordSize")
    public String wordSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDocumentRetrieveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentRetrieveRequest self = new ListDocumentRetrieveRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentRetrieveRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ListDocumentRetrieveRequest setElementScope(String elementScope) {
        this.elementScope = elementScope;
        return this;
    }
    public String getElementScope() {
        return this.elementScope;
    }

    public ListDocumentRetrieveRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDocumentRetrieveRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentRetrieveRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentRetrieveRequest setOffice(String office) {
        this.office = office;
        return this;
    }
    public String getOffice() {
        return this.office;
    }

    public ListDocumentRetrieveRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListDocumentRetrieveRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListDocumentRetrieveRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListDocumentRetrieveRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDocumentRetrieveRequest setSubContentType(String subContentType) {
        this.subContentType = subContentType;
        return this;
    }
    public String getSubContentType() {
        return this.subContentType;
    }

    public ListDocumentRetrieveRequest setSubjectClassify(String subjectClassify) {
        this.subjectClassify = subjectClassify;
        return this;
    }
    public String getSubjectClassify() {
        return this.subjectClassify;
    }

    public ListDocumentRetrieveRequest setWordSize(String wordSize) {
        this.wordSize = wordSize;
        return this;
    }
    public String getWordSize() {
        return this.wordSize;
    }

    public ListDocumentRetrieveRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
