// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20241205</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <strong>example:</strong>
     * <p>totalFrequency</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("recentDays")
    public Integer recentDays;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <strong>example:</strong>
     * <p>schema</p>
     */
    @NameInMap("schema")
    public String schema;

    /**
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("tablePrefix")
    public String tablePrefix;

    /**
     * <strong>example:</strong>
     * <p>28074710977****</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("types")
    public String typesShrink;

    public static ListStorageTablesInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStorageTablesInfoShrinkRequest self = new ListStorageTablesInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListStorageTablesInfoShrinkRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListStorageTablesInfoShrinkRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ListStorageTablesInfoShrinkRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListStorageTablesInfoShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStorageTablesInfoShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStorageTablesInfoShrinkRequest setRecentDays(Integer recentDays) {
        this.recentDays = recentDays;
        return this;
    }
    public Integer getRecentDays() {
        return this.recentDays;
    }

    public ListStorageTablesInfoShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListStorageTablesInfoShrinkRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ListStorageTablesInfoShrinkRequest setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
        return this;
    }
    public String getTablePrefix() {
        return this.tablePrefix;
    }

    public ListStorageTablesInfoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListStorageTablesInfoShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
