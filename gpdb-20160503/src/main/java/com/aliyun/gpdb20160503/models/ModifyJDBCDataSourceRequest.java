// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyJDBCDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

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

    public static ModifyJDBCDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyJDBCDataSourceRequest self = new ModifyJDBCDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyJDBCDataSourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyJDBCDataSourceRequest setDataSourceDescription(String dataSourceDescription) {
        this.dataSourceDescription = dataSourceDescription;
        return this;
    }
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    public ModifyJDBCDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ModifyJDBCDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ModifyJDBCDataSourceRequest setJDBCConnectionString(String JDBCConnectionString) {
        this.JDBCConnectionString = JDBCConnectionString;
        return this;
    }
    public String getJDBCConnectionString() {
        return this.JDBCConnectionString;
    }

    public ModifyJDBCDataSourceRequest setJDBCPassword(String JDBCPassword) {
        this.JDBCPassword = JDBCPassword;
        return this;
    }
    public String getJDBCPassword() {
        return this.JDBCPassword;
    }

    public ModifyJDBCDataSourceRequest setJDBCUserName(String JDBCUserName) {
        this.JDBCUserName = JDBCUserName;
        return this;
    }
    public String getJDBCUserName() {
        return this.JDBCUserName;
    }

    public ModifyJDBCDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
