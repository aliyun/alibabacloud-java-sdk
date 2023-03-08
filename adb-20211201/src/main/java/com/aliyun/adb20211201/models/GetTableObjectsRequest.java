// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableObjectsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FilterDescription")
    public String filterDescription;

    @NameInMap("FilterOwner")
    public String filterOwner;

    @NameInMap("FilterTblName")
    public String filterTblName;

    @NameInMap("FilterTblType")
    public String filterTblType;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SchemaName")
    public String schemaName;

    public static GetTableObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsRequest self = new GetTableObjectsRequest();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetTableObjectsRequest setFilterDescription(String filterDescription) {
        this.filterDescription = filterDescription;
        return this;
    }
    public String getFilterDescription() {
        return this.filterDescription;
    }

    public GetTableObjectsRequest setFilterOwner(String filterOwner) {
        this.filterOwner = filterOwner;
        return this;
    }
    public String getFilterOwner() {
        return this.filterOwner;
    }

    public GetTableObjectsRequest setFilterTblName(String filterTblName) {
        this.filterTblName = filterTblName;
        return this;
    }
    public String getFilterTblName() {
        return this.filterTblName;
    }

    public GetTableObjectsRequest setFilterTblType(String filterTblType) {
        this.filterTblType = filterTblType;
        return this;
    }
    public String getFilterTblType() {
        return this.filterTblType;
    }

    public GetTableObjectsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetTableObjectsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetTableObjectsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetTableObjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTableObjectsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
