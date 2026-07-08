// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDocsRequest extends TeaModel {
    /**
     * <p>Document folder.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Document name.</p>
     * 
     * <strong>example:</strong>
     * <p>企业2022年報</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>Document type.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Next page token.</p>
     * 
     * <strong>example:</strong>
     * <p>52a33dc83779f63641e16f5146cd7125</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Skip n records for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <p>Document status list.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<Integer> statuses;

    /**
     * <p>Alibaba Cloud Model Studio workspace ID. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">How to Use Workspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDocsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocsRequest self = new ListDocsRequest();
        return TeaModel.build(map, self);
    }

    public ListDocsRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListDocsRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public ListDocsRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListDocsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListDocsRequest setStatuses(java.util.List<Integer> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<Integer> getStatuses() {
        return this.statuses;
    }

    public ListDocsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
