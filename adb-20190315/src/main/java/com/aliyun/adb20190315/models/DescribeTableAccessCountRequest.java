// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableAccessCountRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of all AnalyticDB for MySQL clusters within a specified region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON string format. Example: <code>[{&quot;Field&quot;:&quot;TableSchema&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>.</p>
     * <ul>
     * <li><p><code>Field</code> indicates the field that is used to sort the retrieved entries. Valid values:</p>
     * <ul>
     * <li><code>TableSchema</code>: the name of the database to which the table belongs.</li>
     * <li><code>TableName</code>: the name of the table.</li>
     * <li><code>AccessCount</code>: the number of accesses to the table.</li>
     * </ul>
     * </li>
     * <li><p><code>Type</code> indicates the sorting method. Valid values:</p>
     * <ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is not specified, query results are sorted in ascending order of the database to which a specific table belongs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;TableSchema&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The value must be a positive integer. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The date to query. Specify the time in the <em>yyyy-MM-dd</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p> Only data for the last 30 days can be queried.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-30</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the specific table.</p>
     * <blockquote>
     * <p> If this parameter is not specified, the number of accesses to all tables within the specified cluster for a specified date is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeTableAccessCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableAccessCountRequest self = new DescribeTableAccessCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTableAccessCountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTableAccessCountRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeTableAccessCountRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableAccessCountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableAccessCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTableAccessCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTableAccessCountRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
