// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTableStatisticsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The keyword that is used to query information by table name.</p>
     * 
     * <strong>example:</strong>
     * <p>you_table_name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The order by which to sort query results. Specify the parameter value in the JSON format.</p>
     * <p>Example:</p>
     * <pre><code>[
     * 
     *     {
     * 
     *         &quot;Field&quot;:&quot;Name&quot;,
     * 
     *         &quot;Type&quot;:&quot;Asc&quot;
     * 
     *     }
     * 
     * ]
     * </code></pre>
     * <p>Field specifies the field by which to sort the query results. Set the value to Name. Type specifies the sorting order. Valid values: Desc and Asc.</p>
     * <p>Field and Type are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    public static DescribeTableStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableStatisticsRequest self = new DescribeTableStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTableStatisticsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTableStatisticsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeTableStatisticsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeTableStatisticsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTableStatisticsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
