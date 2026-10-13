// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultTablePageRequest extends TeaModel {
    /**
     * <p>The identifier of the component (data source) type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("componentType")
    public Integer componentType;

    /**
     * <p>The filter condition for the data range.</p>
     * 
     * <strong>example:</strong>
     * <p>LAST_7_DAYS</p>
     */
    @NameInMap("dataRange")
    public String dataRange;

    /**
     * <p>The threshold for filtering by data size. This parameter must be used together with dataUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1024.0</p>
     */
    @NameInMap("dataSize")
    public Double dataSize;

    /**
     * <p>The unit of data size, such as GB or TB. This parameter must be used together with dataSize.</p>
     * 
     * <strong>example:</strong>
     * <p>GB</p>
     */
    @NameInMap("dataUnit")
    public String dataUnit;

    /**
     * <p>The name of the database, which is used to filter results by database.</p>
     * 
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>The name of the group-by field, which is used for aggregate statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>Specifies whether to filter only partitioned tables.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("isPartitioned")
    public Integer isPartitioned;

    /**
     * <p>Specifies whether to return only summary statistics.</p>
     */
    @NameInMap("isSummary")
    public Boolean isSummary;

    /**
     * <p>The migration status, which is used to filter by migration progress or indicate the migration status of an object.</p>
     * 
     * <strong>example:</strong>
     * <p>DONE</p>
     */
    @NameInMap("migrationStatus")
    public String migrationStatus;

    /**
     * <p>Specifies whether to return the total number of records.</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The name of the order-by field.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction, such as ascending (ASC) or descending (DESC).</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of records to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The name of the table, which is used to filter results by table name.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_order_detail</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>The ID of the metadata profiling task, which is used to locate the profiling task to which this query belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>The identifier of the object type.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("type")
    public String type;

    public static ListMetaProfilingResultTablePageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultTablePageRequest self = new ListMetaProfilingResultTablePageRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultTablePageRequest setComponentType(Integer componentType) {
        this.componentType = componentType;
        return this;
    }
    public Integer getComponentType() {
        return this.componentType;
    }

    public ListMetaProfilingResultTablePageRequest setDataRange(String dataRange) {
        this.dataRange = dataRange;
        return this;
    }
    public String getDataRange() {
        return this.dataRange;
    }

    public ListMetaProfilingResultTablePageRequest setDataSize(Double dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Double getDataSize() {
        return this.dataSize;
    }

    public ListMetaProfilingResultTablePageRequest setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

    public ListMetaProfilingResultTablePageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMetaProfilingResultTablePageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListMetaProfilingResultTablePageRequest setIsPartitioned(Integer isPartitioned) {
        this.isPartitioned = isPartitioned;
        return this;
    }
    public Integer getIsPartitioned() {
        return this.isPartitioned;
    }

    public ListMetaProfilingResultTablePageRequest setIsSummary(Boolean isSummary) {
        this.isSummary = isSummary;
        return this;
    }
    public Boolean getIsSummary() {
        return this.isSummary;
    }

    public ListMetaProfilingResultTablePageRequest setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    public ListMetaProfilingResultTablePageRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListMetaProfilingResultTablePageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaProfilingResultTablePageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetaProfilingResultTablePageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultTablePageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultTablePageRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListMetaProfilingResultTablePageRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListMetaProfilingResultTablePageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
