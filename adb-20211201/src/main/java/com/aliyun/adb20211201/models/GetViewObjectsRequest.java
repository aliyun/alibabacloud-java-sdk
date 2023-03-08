// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewObjectsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FilterOwner")
    public String filterOwner;

    @NameInMap("FilterViewName")
    public String filterViewName;

    @NameInMap("FilterViewType")
    public String filterViewType;

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

    public static GetViewObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetViewObjectsRequest self = new GetViewObjectsRequest();
        return TeaModel.build(map, self);
    }

    public GetViewObjectsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetViewObjectsRequest setFilterOwner(String filterOwner) {
        this.filterOwner = filterOwner;
        return this;
    }
    public String getFilterOwner() {
        return this.filterOwner;
    }

    public GetViewObjectsRequest setFilterViewName(String filterViewName) {
        this.filterViewName = filterViewName;
        return this;
    }
    public String getFilterViewName() {
        return this.filterViewName;
    }

    public GetViewObjectsRequest setFilterViewType(String filterViewType) {
        this.filterViewType = filterViewType;
        return this;
    }
    public String getFilterViewType() {
        return this.filterViewType;
    }

    public GetViewObjectsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetViewObjectsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetViewObjectsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetViewObjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetViewObjectsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
