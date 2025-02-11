// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2zez35ww415xjwk5</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2024-11-28 23:00:00</p>
     */
    @NameInMap("MaxStartTime")
    public String maxStartTime;

    /**
     * <strong>example:</strong>
     * <p>2024-11-28 22:00:00</p>
     */
    @NameInMap("MinStartTime")
    public String minStartTime;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;QueryStartTime\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>123</p>
     */
    @NameInMap("StatementId")
    public Long statementId;

    public static DescribeSparkSQLDiagnosisListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisListRequest self = new DescribeSparkSQLDiagnosisListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkSQLDiagnosisListRequest setMaxStartTime(String maxStartTime) {
        this.maxStartTime = maxStartTime;
        return this;
    }
    public String getMaxStartTime() {
        return this.maxStartTime;
    }

    public DescribeSparkSQLDiagnosisListRequest setMinStartTime(String minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }
    public String getMinStartTime() {
        return this.minStartTime;
    }

    public DescribeSparkSQLDiagnosisListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSparkSQLDiagnosisListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkSQLDiagnosisListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkSQLDiagnosisListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSparkSQLDiagnosisListRequest setStatementId(Long statementId) {
        this.statementId = statementId;
        return this;
    }
    public Long getStatementId() {
        return this.statementId;
    }

}
