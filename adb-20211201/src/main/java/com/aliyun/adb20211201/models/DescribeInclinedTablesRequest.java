// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-k2jofo4pi5zhd****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li><strong>zh (default)</strong>: simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

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
     * <p>[      {          &quot;Field&quot;:&quot;Name&quot;,          &quot;Type&quot;:&quot;Asc&quot;      }  ]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the table. Valid values:</p>
     * <ul>
     * <li><strong>FactTable</strong>: the partitioned table.</li>
     * <li><strong>DimensionTable</strong>: the dimension table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FactTable</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static DescribeInclinedTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesRequest self = new DescribeInclinedTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeInclinedTablesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInclinedTablesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeInclinedTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInclinedTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInclinedTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInclinedTablesRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
