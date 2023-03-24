// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegeObjectsRequest extends TeaModel {
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
