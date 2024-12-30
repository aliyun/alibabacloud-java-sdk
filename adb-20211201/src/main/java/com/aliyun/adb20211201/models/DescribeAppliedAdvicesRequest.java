// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAppliedAdvicesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INDEX</p>
     */
    @NameInMap("AdviceType")
    public String adviceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-uf6g8w25jacm7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>20220824</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>you_table_name</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;AdviceType\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>tpch.lineitem</p>
     */
    @NameInMap("SchemaTableName")
    public String schemaTableName;

    /**
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
