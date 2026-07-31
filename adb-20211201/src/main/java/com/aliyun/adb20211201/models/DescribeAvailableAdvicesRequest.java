// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesRequest extends TeaModel {
    /**
     * <p>The date when the advice was generated, in the <code>yyyyMMdd</code> format.</p>
     * <blockquote>
     * <p>Advice is generated daily. To query for advice, specify a date at least one day before the current date. For example, if you query on June 27, 2024, set this parameter to <code>20240626</code> or an earlier date.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20221124</p>
     */
    @NameInMap("AdviceDate")
    public Long adviceDate;

    /**
     * <p>The type of advice. Valid values:</p>
     * <ul>
     * <li><p><strong>INDEX</strong>: index optimization.</p>
     * </li>
     * <li><p><strong>TIERING</strong>: hot and cold data tiering.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INDEX</p>
     */
    @NameInMap("AdviceType")
    public String adviceType;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp198m028ih55****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The keyword for a fuzzy search on table names.</p>
     * 
     * <strong>example:</strong>
     * <p>you_table_name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The display language for the advice. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Simplified Chinese (default).</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * <li><p><strong>ja</strong>: Japanese.</p>
     * </li>
     * <li><p><strong>zh-tw</strong>: Traditional Chinese.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the sort order for the results. The value is a JSON string. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. The JSON string contains the following key-value pairs:</p>
     * <ul>
     * <li><p><code>Field</code>: the field to sort by. Valid values:</p>
     * <ul>
     * <li><p><code>SchemaName</code>: the database name.</p>
     * </li>
     * <li><p><code>TableName</code>: the table name.</p>
     * </li>
     * <li><p><code>Benefit</code>: the expected benefit.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: the sort order. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending order.</p>
     * </li>
     * <li><p><code>Desc</code>: descending order.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>By default, results are sorted by expected benefit in descending order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;AdviceType\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A concatenation of the database name and the table name.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch.lineitem</p>
     */
    @NameInMap("SchemaTableName")
    public String schemaTableName;

    public static DescribeAvailableAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableAdvicesRequest self = new DescribeAvailableAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableAdvicesRequest setAdviceDate(Long adviceDate) {
        this.adviceDate = adviceDate;
        return this;
    }
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    public DescribeAvailableAdvicesRequest setAdviceType(String adviceType) {
        this.adviceType = adviceType;
        return this;
    }
    public String getAdviceType() {
        return this.adviceType;
    }

    public DescribeAvailableAdvicesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAvailableAdvicesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeAvailableAdvicesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAvailableAdvicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeAvailableAdvicesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableAdvicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableAdvicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableAdvicesRequest setSchemaTableName(String schemaTableName) {
        this.schemaTableName = schemaTableName;
        return this;
    }
    public String getSchemaTableName() {
        return this.schemaTableName;
    }

}
