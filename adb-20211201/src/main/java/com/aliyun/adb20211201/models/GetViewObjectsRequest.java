// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewObjectsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The owner of the view.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("FilterOwner")
    public String filterOwner;

    /**
     * <p>The name of the view.</p>
     * 
     * <strong>example:</strong>
     * <p>test_filter</p>
     */
    @NameInMap("FilterViewName")
    public String filterViewName;

    /**
     * <p>The type of the view.</p>
     * <p>Valid values:</p>
     * <p>\-VIRTUAL_VIEW</p>
     * <p>\-MATERIALIZED_VIEW</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRTUAL_VIEW</p>
     */
    @NameInMap("FilterViewType")
    public String filterViewType;

    /**
     * <p>The order in which you want to sort the query results. Valid values for Type:</p>
     * <ul>
     * <li>Asc</li>
     * <li>Desc</li>
     * </ul>
     * <p>Valid values for Field: -ViewName</p>
     * <p>\-CreateTime</p>
     * <p>\-UpdateTime</p>
     * <p>Default value: {&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;ViewName&quot;}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;ViewName&quot;}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
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
