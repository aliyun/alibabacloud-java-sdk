// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesRequest extends TeaModel {
    /**
     * <p>The generation date of the suggestion, in the yyyyMMdd format.</p>
     * <blockquote>
     * <p>Data is generated after daily analysis in the early morning. Therefore, you must specify a date of T-1 or earlier to query the data. For example, if today is 20240627, you must specify 20240626 or an earlier date.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20221124</p>
     */
    @NameInMap("AdviceDate")
    public Long adviceDate;

    /**
     * <p>The type of the suggestion. Valid values:</p>
     * <ul>
     * <li><strong>INDEX</strong>: Index optimization.</li>
     * <li><strong>TIERING</strong>: Hot and cold data optimization.</li>
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
     * <p>The query keyword. Fuzzy search by table name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>you_table_name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The display language of the suggestions. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Simplified Chinese (default).</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: Traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The field by which to sort the query results. The value is a JSON string. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
     * <ul>
     * <li><code>Field</code>: the sort field. Valid values:<ul>
     * <li><code>SchemaName</code>: the database name.</li>
     * <li><code>TableName</code>: the table name.</li>
     * <li><code>Benefit</code>: the expected optimization benefit.</li>
     * </ul>
     * </li>
     * <li><code>Type</code>: the sort order. Valid values:<ul>
     * <li><code>Asc</code>: ascending order.</li>
     * <li><code>Desc</code>: descending order.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the results are sorted in descending order of the expected optimization benefit by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;AdviceType\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Valid values: greater than 0 and up to the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

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
     * <p>The concatenated string of the database name and table name.</p>
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
