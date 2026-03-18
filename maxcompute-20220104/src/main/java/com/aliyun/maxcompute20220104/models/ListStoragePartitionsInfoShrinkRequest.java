// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStoragePartitionsInfoShrinkRequest extends TeaModel {
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

    @NameInMap("partitionPrefix")
    public String partitionPrefix;

    @NameInMap("region")
    public String region;

    @NameInMap("schema")
    public String schema;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("types")
    public String typesShrink;

    public static ListStoragePartitionsInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStoragePartitionsInfoShrinkRequest self = new ListStoragePartitionsInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListStoragePartitionsInfoShrinkRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListStoragePartitionsInfoShrinkRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ListStoragePartitionsInfoShrinkRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListStoragePartitionsInfoShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStoragePartitionsInfoShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStoragePartitionsInfoShrinkRequest setPartitionPrefix(String partitionPrefix) {
        this.partitionPrefix = partitionPrefix;
        return this;
    }
    public String getPartitionPrefix() {
        return this.partitionPrefix;
    }

    public ListStoragePartitionsInfoShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListStoragePartitionsInfoShrinkRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ListStoragePartitionsInfoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListStoragePartitionsInfoShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
