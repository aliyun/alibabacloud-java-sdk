// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyJDBCDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DataSourceDescription")
    public String dataSourceDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The JDBC connection string.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCConnectionString")
    public String JDBCConnectionString;

    /**
     * <p>The password of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCPassword")
    public String JDBCPassword;

    /**
     * <p>The name of the database account.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("JDBCUserName")
    public String JDBCUserName;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
