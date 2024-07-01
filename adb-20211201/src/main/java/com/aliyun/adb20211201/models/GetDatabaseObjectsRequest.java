// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1565u55p32****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The owner of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("FilterOwner")
    public String filterOwner;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("FilterSchemaName")
    public String filterSchemaName;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li>Asc</li>
     * <li>Desc</li>
     * </ul>
     * <p>Valid values for Field: DatabaseName, CreateTime, and UpdateTime. -CreateTime; -UpdateTime;</p>
     * <p>Default value: {&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;DatabaseName&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;DbName&quot;}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
