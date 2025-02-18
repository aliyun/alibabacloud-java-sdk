// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort data in ascending order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>The date on which the statistics are collected, in days. Set this parameter to a value in the <code>YYYYMMdd</code> format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20241205</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The sorting column.</p>
     * 
     * <strong>example:</strong>
     * <p>totalFrequency</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The number of recent days for comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("recentDays")
    public Integer recentDays;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The name of the schema.</p>
     * 
     * <strong>example:</strong>
     * <p>schema</p>
     */
    @NameInMap("schema")
    public String schema;

    /**
     * <p>The name of the table that you want to use for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>bank</p>
     */
    @NameInMap("tablePrefix")
    public String tablePrefix;

    /**
     * <p>The ID of the tenant. You can log on to the MaxCompute console, and choose <strong>Tenants</strong> &gt; <strong>Tenant Property</strong> from the left-side navigation pane to view the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>28074710977****</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The storage types.</p>
     */
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
