// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableObjectsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1565u55p32****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("FilterDescription")
    public String filterDescription;

    /**
     * <p>The owner of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("FilterOwner")
    public String filterOwner;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("FilterTblName")
    public String filterTblName;

    /**
     * <p>The type of the table.</p>
     * <p>Valid values:</p>
     * <p>DIMENSION_TABLE</p>
     * <p>FACT_TABLE</p>
     * <p>EXTERNAL_TABLE</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>FACT_TABLE</p>
     */
    @NameInMap("FilterTblType")
    public String filterTblType;

    /**
     * <p>The order in which the fields to be returned are sorted.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Asc</li>
     * <li>Desc</li>
     * </ul>
     * <p>Values for fields:</p>
     * <p>TableName</p>
     * <p>TableSize</p>
     * <p>CreateTime</p>
     * <p>UpdateTime</p>
     * <p>Default value: {&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;TableName&quot;};</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;TableName&quot;}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. The value is an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
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
     * <p>The ID of the region in which the cluster resides.</p>
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
