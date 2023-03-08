// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FilterOwner")
    public String filterOwner;

    @NameInMap("FilterSchemaName")
    public String filterSchemaName;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static GetDatabaseObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsRequest self = new GetDatabaseObjectsRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetDatabaseObjectsRequest setFilterOwner(String filterOwner) {
        this.filterOwner = filterOwner;
        return this;
    }
    public String getFilterOwner() {
        return this.filterOwner;
    }

    public GetDatabaseObjectsRequest setFilterSchemaName(String filterSchemaName) {
        this.filterSchemaName = filterSchemaName;
        return this;
    }
    public String getFilterSchemaName() {
        return this.filterSchemaName;
    }

    public GetDatabaseObjectsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetDatabaseObjectsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetDatabaseObjectsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDatabaseObjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
