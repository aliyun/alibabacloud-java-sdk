// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegeObjectsRequest extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The column name that is used to filter columns.</p>
     * 
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("ColumnPrivilegeObject")
    public String columnPrivilegeObject;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k3wdmt139****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The database name that is used to filter databases.</p>
     * 
     * <strong>example:</strong>
     * <p>database1</p>
     */
    @NameInMap("DatabasePrivilegeObject")
    public String databasePrivilegeObject;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The permission level. Valid values: Database, Table, and Column. Global is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Column</p>
     */
    @NameInMap("PrivilegeType")
    public String privilegeType;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ch-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The table name that is used to filter tables.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("TablePrivilegeObject")
    public String tablePrivilegeObject;

    public static DescribeAccountPrivilegeObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegeObjectsRequest self = new DescribeAccountPrivilegeObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegeObjectsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountPrivilegeObjectsRequest setColumnPrivilegeObject(String columnPrivilegeObject) {
        this.columnPrivilegeObject = columnPrivilegeObject;
        return this;
    }
    public String getColumnPrivilegeObject() {
        return this.columnPrivilegeObject;
    }

    public DescribeAccountPrivilegeObjectsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAccountPrivilegeObjectsRequest setDatabasePrivilegeObject(String databasePrivilegeObject) {
        this.databasePrivilegeObject = databasePrivilegeObject;
        return this;
    }
    public String getDatabasePrivilegeObject() {
        return this.databasePrivilegeObject;
    }

    public DescribeAccountPrivilegeObjectsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountPrivilegeObjectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountPrivilegeObjectsRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public DescribeAccountPrivilegeObjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountPrivilegeObjectsRequest setTablePrivilegeObject(String tablePrivilegeObject) {
        this.tablePrivilegeObject = tablePrivilegeObject;
        return this;
    }
    public String getTablePrivilegeObject() {
        return this.tablePrivilegeObject;
    }

}
