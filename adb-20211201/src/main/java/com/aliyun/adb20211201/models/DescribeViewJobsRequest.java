// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeViewJobsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
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
     * <p>test_mv</p>
     */
    @NameInMap("FilterViewName")
    public String filterViewName;

    /**
     * <p>The type of the view.</p>
     * <p>Valid values:</p>
     * <p>\-VIRTUAL_VIEW</p>
     * <p>\-MATERIALIZED_VIEW</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>MATERIALIZED_VIEW</p>
     */
    @NameInMap("FilterViewType")
    public String filterViewType;

    /**
     * <p>The field used for sorting. Valid values for Type:</p>
     * <ul>
     * <li>Asc.</li>
     * <li>Desc.</li>
     * </ul>
     * <p>Valid values for Field:</p>
     * <ul>
     * <li>StartTime.</li>
     * <li>EndTime;</li>
     * <li>ScheduledStartTime;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Field\&quot;:\&quot;StartTime\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}</p>
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
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_db</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    public static DescribeViewJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewJobsRequest self = new DescribeViewJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeViewJobsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeViewJobsRequest setFilterOwner(String filterOwner) {
        this.filterOwner = filterOwner;
        return this;
    }
    public String getFilterOwner() {
        return this.filterOwner;
    }

    public DescribeViewJobsRequest setFilterViewName(String filterViewName) {
        this.filterViewName = filterViewName;
        return this;
    }
    public String getFilterViewName() {
        return this.filterViewName;
    }

    public DescribeViewJobsRequest setFilterViewType(String filterViewType) {
        this.filterViewType = filterViewType;
        return this;
    }
    public String getFilterViewType() {
        return this.filterViewType;
    }

    public DescribeViewJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeViewJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeViewJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeViewJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeViewJobsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
