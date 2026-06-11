// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDocumentChunksRequest extends TeaModel {
    /**
     * <p>A filter pattern. The operation returns only the chunks whose titles contain this pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ChunkTitlePattern")
    public String chunkTitlePattern;

    /**
     * <p>The name of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Omit this parameter to get the first page. If the response returns a <code>NextToken</code>, it indicates that more results are available. To get the next page, pass this <code>NextToken</code> value in the <code>NextToken</code> parameter of your next request. A null value for NextToken indicates that all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li><p><strong>id</strong> (default): The chunk ID.</p>
     * </li>
     * <li><p><strong>hits</strong>: The number of hits.</p>
     * </li>
     * <li><p><strong>modifyTime</strong>: The modification time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hits</p>
     */
    @NameInMap("SortFieldName")
    public String sortFieldName;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>ASC</strong> (default): ascending order.</p>
     * </li>
     * <li><p><strong>DESC</strong>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListDocumentChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentChunksRequest self = new ListDocumentChunksRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentChunksRequest setChunkTitlePattern(String chunkTitlePattern) {
        this.chunkTitlePattern = chunkTitlePattern;
        return this;
    }
    public String getChunkTitlePattern() {
        return this.chunkTitlePattern;
    }

    public ListDocumentChunksRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public ListDocumentChunksRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public ListDocumentChunksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentChunksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentChunksRequest setSortFieldName(String sortFieldName) {
        this.sortFieldName = sortFieldName;
        return this;
    }
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public ListDocumentChunksRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
