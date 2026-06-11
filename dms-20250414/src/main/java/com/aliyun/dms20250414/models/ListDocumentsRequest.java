// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDocumentsRequest extends TeaModel {
    /**
     * <p>The document property filter. The following properties are supported:</p>
     * <ul>
     * <li><p><code>fileExt</code>: The document extension.</p>
     * </li>
     * <li><p><code>state</code>: The document status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fileExt&quot;:&quot;pdf&quot;,&quot;state&quot;:0}</p>
     */
    @NameInMap("Filters")
    public String filters;

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
     * <p>The maximum number of documents to return per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The document name filter. Returns only documents whose names contain this value.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NamePattern")
    public String namePattern;

    /**
     * <p>The pagination token to retrieve the next page of results. Omit this parameter to retrieve the first page. A <code>NextToken</code> value in the response indicates that more results are available. To fetch the next page, pass this value in a subsequent request. A <code>null</code> value indicates that all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li><p><code>id</code> (default): The document ID.</p>
     * </li>
     * <li><p><code>hits</code>: The number of hits.</p>
     * </li>
     * <li><p><code>modifyTime</code>: The modification time.</p>
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
     * <li><p><strong>ASC</strong> (default): Sorts in ascending order.</p>
     * </li>
     * <li><p><strong>DESC</strong>: Sorts in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsRequest self = new ListDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentsRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListDocumentsRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public ListDocumentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentsRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }
    public String getNamePattern() {
        return this.namePattern;
    }

    public ListDocumentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentsRequest setSortFieldName(String sortFieldName) {
        this.sortFieldName = sortFieldName;
        return this;
    }
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public ListDocumentsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
