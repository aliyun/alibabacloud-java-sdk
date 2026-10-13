// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultCatalogPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>catalog_hive_prod</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    /**
     * <strong>example:</strong>
     * <p>ods</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

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
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static ListMetaProfilingResultCatalogPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultCatalogPageRequest self = new ListMetaProfilingResultCatalogPageRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultCatalogPageRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public ListMetaProfilingResultCatalogPageRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMetaProfilingResultCatalogPageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListMetaProfilingResultCatalogPageRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListMetaProfilingResultCatalogPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaProfilingResultCatalogPageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetaProfilingResultCatalogPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultCatalogPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultCatalogPageRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
