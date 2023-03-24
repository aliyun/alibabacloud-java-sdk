// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ColumnPrivilegeObject")
    public String columnPrivilegeObject;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DatabasePrivilegeObject")
    public String databasePrivilegeObject;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PrivilegeType")
    public String privilegeType;

    @NameInMap("RegionId")
    public String regionId;

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
