// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateJDBCDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("JDBCConnectionString")
    public String JDBCConnectionString;

    @NameInMap("JDBCPassword")
    public String JDBCPassword;

    @NameInMap("JDBCUserName")
    public String JDBCUserName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateJDBCDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJDBCDataSourceRequest self = new CreateJDBCDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateJDBCDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateJDBCDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public CreateJDBCDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateJDBCDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateJDBCDataSourceRequest setJDBCConnectionString(String JDBCConnectionString) {
        this.JDBCConnectionString = JDBCConnectionString;
        return this;
    }
    public String getJDBCConnectionString() {
        return this.JDBCConnectionString;
    }

    public CreateJDBCDataSourceRequest setJDBCPassword(String JDBCPassword) {
        this.JDBCPassword = JDBCPassword;
        return this;
    }
    public String getJDBCPassword() {
        return this.JDBCPassword;
    }

    public CreateJDBCDataSourceRequest setJDBCUserName(String JDBCUserName) {
        this.JDBCUserName = JDBCUserName;
        return this;
    }
    public String getJDBCUserName() {
        return this.JDBCUserName;
    }

    public CreateJDBCDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
