// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeProjectsRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter or set it to an empty string for the first page. For subsequent pages, pass the nextToken value from the previous response without any modification. If the nextToken value in the response is empty, the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The keyword for fuzzy match by project name or prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The field by which to sort the results. Default value: last_scan_time.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>last_scan_time: the time when a task was last created.</li>
     * <li>created_at: the time when the project was created.</li>
     * <li>updated_at: the time when the project was last modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>last_scan_time</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The sort order. Default value: desc.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    public static DescribeProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectsRequest self = new DescribeProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeProjectsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProjectsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeProjectsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeProjectsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
