// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesRequest extends TeaModel {
    /**
     * <p>The filter conditions for the knowledge bases, specified as a JSON string. The only supported key is <code>state</code>. Valid values are <code>0</code> and <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;state&quot;:1}</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The maximum number of entries to return on each page. Use this parameter with the <code>NextToken</code> parameter to implement pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A keyword to search for in the names of knowledge bases.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("NamePattern")
    public String namePattern;

    /**
     * <p>The token used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>Omit this parameter for the first request.</p>
     * </li>
     * <li><p>If the previous response returned a <strong>NextToken</strong> value, use it to retrieve the next page of results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li><p><code>id</code>: Sorts by knowledge base ID. This is the default.</p>
     * </li>
     * <li><p><code>name</code>: Sorts by knowledge base name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SortFieldName")
    public String sortFieldName;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>ASC</strong>: Ascending order. This is the default.</p>
     * </li>
     * <li><p><strong>DESC</strong>: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The tag of the knowledge base. In DataAgent, this is the space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dq7qod8hxtt1***</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static ListKnowledgeBasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesRequest self = new ListKnowledgeBasesRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListKnowledgeBasesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBasesRequest setNamePattern(String namePattern) {
        this.namePattern = namePattern;
        return this;
    }
    public String getNamePattern() {
        return this.namePattern;
    }

    public ListKnowledgeBasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgeBasesRequest setSortFieldName(String sortFieldName) {
        this.sortFieldName = sortFieldName;
        return this;
    }
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    public ListKnowledgeBasesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListKnowledgeBasesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
