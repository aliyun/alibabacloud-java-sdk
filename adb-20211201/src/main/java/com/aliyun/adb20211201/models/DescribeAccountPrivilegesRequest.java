// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesRequest extends TeaModel {
    /**
     * <p>The name of the database account whose privileges you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Filters the results by column name. This parameter is used only when <code>PrivilegeType</code> is set to <code>Column</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>col1</p>
     */
    @NameInMap("ColumnPrivilegeObject")
    public String columnPrivilegeObject;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1k5p066e1a****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Filters the results by database name. This parameter is used only when <code>PrivilegeType</code> is set to <code>Database</code>, <code>Table</code>, or <code>Column</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>db1</p>
     */
    @NameInMap("DatabasePrivilegeObject")
    public String databasePrivilegeObject;

    /**
     * <p>The page number. Pages start at 1. Default value: 1.</p>
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The privilege level to query. To obtain the valid values for this parameter, call the <code>DescribeEnabledPrivileges</code> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("PrivilegeType")
    public String privilegeType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Filters the results by table name. You can use this parameter with <code>DatabasePrivilegeObject</code> to refine the search. This parameter is used only when <code>PrivilegeType</code> is set to <code>Table</code> or <code>Column</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("TablePrivilegeObject")
    public String tablePrivilegeObject;

    public static DescribeAccountPrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegesRequest self = new DescribeAccountPrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegesRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeAccountPrivilegesRequest setColumnPrivilegeObject(String columnPrivilegeObject) {
        this.columnPrivilegeObject = columnPrivilegeObject;
        return this;
    }
    public String getColumnPrivilegeObject() {
        return this.columnPrivilegeObject;
    }

    public DescribeAccountPrivilegesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAccountPrivilegesRequest setDatabasePrivilegeObject(String databasePrivilegeObject) {
        this.databasePrivilegeObject = databasePrivilegeObject;
        return this;
    }
    public String getDatabasePrivilegeObject() {
        return this.databasePrivilegeObject;
    }

    public DescribeAccountPrivilegesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountPrivilegesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountPrivilegesRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public DescribeAccountPrivilegesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountPrivilegesRequest setTablePrivilegeObject(String tablePrivilegeObject) {
        this.tablePrivilegeObject = tablePrivilegeObject;
        return this;
    }
    public String getTablePrivilegeObject() {
        return this.tablePrivilegeObject;
    }

}
