// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternCompareReportsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-2ze1234567890****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The number of rows per page for token-based pagination. Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * <blockquote>
     * <ul>
     * <li>When you use <code>NextToken</code> for pagination, keep this parameter unchanged.</li>
     * <li>This parameter does not take effect when you use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
     * <li>We recommend that you use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * <blockquote>
     * <ul>
     * <li>Do not specify this parameter for the first query. For subsequent queries, pass in the <code>NextToken</code> value returned by the previous query.</li>
     * <li>Do not use this parameter together with <code>PageNumber</code> or <code>PageSize</code>.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>djE6Mjo1MA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sorts the query results by a specified field. The value is a JSON array string, for example, <code>[{&quot;Field&quot;:&quot;CreatedAt&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</code>. The array can contain only one object. Fields:</p>
     * <ul>
     * <li><code>Field</code>: the field by which to sort. Valid values:<ul>
     * <li><code>CreatedAt</code>: the time when the report was created.</li>
     * <li><code>StartTime</code>: the start time of time range 1.</li>
     * <li><code>CompareStartTime</code>: the start time of time range 2.</li>
     * </ul>
     * </li>
     * <li><code>Type</code>: the sort order. This value is case-insensitive. Valid values:<ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the results are sorted by <code>CreatedAt</code> in descending order by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;CreatedAt&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1.</p>
     * <p>Default value: 1.</p>
     * <blockquote>
     * <p>Use this parameter together with <code>PageSize</code>. If you specify this parameter, <code>NextToken</code> must be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page. Valid values: 1 to 100.</p>
     * <p>Default value: 50.</p>
     * <blockquote>
     * <p>Use this parameter together with <code>PageNumber</code>. If you specify this parameter, <code>NextToken</code> must be empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSqlPatternCompareReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternCompareReportsRequest self = new DescribeSqlPatternCompareReportsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternCompareReportsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlPatternCompareReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSqlPatternCompareReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSqlPatternCompareReportsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSqlPatternCompareReportsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlPatternCompareReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlPatternCompareReportsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
