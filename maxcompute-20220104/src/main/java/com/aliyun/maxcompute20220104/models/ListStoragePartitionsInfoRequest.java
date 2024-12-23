// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStoragePartitionsInfoRequest extends TeaModel {
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
     * <p>20241201</p>
     */
    @NameInMap("partitionPrefix")
    public String partitionPrefix;

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
     * <p>40713753659****</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("types")
    public java.util.List<String> types;

    public static ListStoragePartitionsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStoragePartitionsInfoRequest self = new ListStoragePartitionsInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListStoragePartitionsInfoRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListStoragePartitionsInfoRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ListStoragePartitionsInfoRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListStoragePartitionsInfoRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStoragePartitionsInfoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStoragePartitionsInfoRequest setPartitionPrefix(String partitionPrefix) {
        this.partitionPrefix = partitionPrefix;
        return this;
    }
    public String getPartitionPrefix() {
        return this.partitionPrefix;
    }

    public ListStoragePartitionsInfoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListStoragePartitionsInfoRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public ListStoragePartitionsInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListStoragePartitionsInfoRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
