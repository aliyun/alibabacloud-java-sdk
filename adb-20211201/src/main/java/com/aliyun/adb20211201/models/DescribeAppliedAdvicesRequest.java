// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAppliedAdvicesRequest extends TeaModel {
    /**
     * <p>The type of the advice. Valid values:</p>
     * <ul>
     * <li><p><strong>INDEX</strong>: index optimization</p>
     * </li>
     * <li><p><strong>TIERING</strong>: hot/cold data optimization</p>
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
     * <p>am-uf6g8w25jacm7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end date of the query. The date is in the <code>yyyyMMdd</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>20220824</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The keyword for the query. Fuzzy match by table name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>you_table_name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language of the query results. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * <li><p><strong>ja</strong>: Japanese</p>
     * </li>
     * <li><p><strong>zh-tw</strong>: Traditional Chinese</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The order by which to sort the query results. The value is a JSON string. Example: <code>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Fields:</p>
     * <ul>
     * <li><p><code>Field</code>: The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><p><code>SchemaName</code>: the database name</p>
     * </li>
     * <li><p><code>TableName</code>: the table name</p>
     * </li>
     * <li><p><code>JobStatus</code>: the status of the build job for the table</p>
     * </li>
     * <li><p><code>SubmitTime</code>: the time when the advice was submitted</p>
     * </li>
     * <li><p><code>Benefit</code>: the estimated benefit</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>Type</code>: The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending</p>
     * </li>
     * <li><p><code>Desc</code>: descending</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, the query results are sorted by advice submission time in descending order.</p>
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
     * <p>The number of entries to return on each page. Valid values:</p>
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
     * <p>The name of the database and table. Format: <strong>database.table</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch.lineitem</p>
     */
    @NameInMap("SchemaTableName")
    public String schemaTableName;

    /**
     * <p>The start date of the query. The date is in the <code>yyyyMMdd</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>20220811</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAppliedAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliedAdvicesRequest self = new DescribeAppliedAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppliedAdvicesRequest setAdviceType(String adviceType) {
        this.adviceType = adviceType;
        return this;
    }
    public String getAdviceType() {
        return this.adviceType;
    }

    public DescribeAppliedAdvicesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAppliedAdvicesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAppliedAdvicesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeAppliedAdvicesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAppliedAdvicesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeAppliedAdvicesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppliedAdvicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppliedAdvicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAppliedAdvicesRequest setSchemaTableName(String schemaTableName) {
        this.schemaTableName = schemaTableName;
        return this;
    }
    public String getSchemaTableName() {
        return this.schemaTableName;
    }

    public DescribeAppliedAdvicesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
