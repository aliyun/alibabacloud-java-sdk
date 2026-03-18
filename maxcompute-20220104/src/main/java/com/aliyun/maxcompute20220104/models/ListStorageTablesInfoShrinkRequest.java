// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoShrinkRequest extends TeaModel {
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("date")
    public String date;

    @NameInMap("orderColumn")
    public String orderColumn;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("recentDays")
    public Integer recentDays;

    @NameInMap("region")
    public String region;

    @NameInMap("schema")
    public String schema;

    @NameInMap("tablePrefix")
    public String tablePrefix;

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
