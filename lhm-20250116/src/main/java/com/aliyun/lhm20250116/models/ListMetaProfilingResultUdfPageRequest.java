// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultUdfPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>catalog_hive_prod</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("componentType")
    public Integer componentType;

    /**
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>udf_parse_json</p>
     */
    @NameInMap("funcName")
    public String funcName;

    /**
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    @NameInMap("isSummary")
    public Boolean isSummary;

    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static ListMetaProfilingResultUdfPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultUdfPageRequest self = new ListMetaProfilingResultUdfPageRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultUdfPageRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListMetaProfilingResultUdfPageRequest setComponentType(Integer componentType) {
        this.componentType = componentType;
        return this;
    }
    public Integer getComponentType() {
        return this.componentType;
    }

    public ListMetaProfilingResultUdfPageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMetaProfilingResultUdfPageRequest setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }
    public String getFuncName() {
        return this.funcName;
    }

    public ListMetaProfilingResultUdfPageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListMetaProfilingResultUdfPageRequest setIsSummary(Boolean isSummary) {
        this.isSummary = isSummary;
        return this;
    }
    public Boolean getIsSummary() {
        return this.isSummary;
    }

    public ListMetaProfilingResultUdfPageRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListMetaProfilingResultUdfPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaProfilingResultUdfPageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetaProfilingResultUdfPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultUdfPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultUdfPageRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
