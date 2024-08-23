// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The JDBC connection string.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("JdbcConnectionString")
    public String jdbcConnectionString;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CheckJDBCSourceNetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckJDBCSourceNetConnectionRequest self = new CheckJDBCSourceNetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CheckJDBCSourceNetConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckJDBCSourceNetConnectionRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CheckJDBCSourceNetConnectionRequest setJdbcConnectionString(String jdbcConnectionString) {
        this.jdbcConnectionString = jdbcConnectionString;
        return this;
    }
    public String getJdbcConnectionString() {
        return this.jdbcConnectionString;
    }

    public CheckJDBCSourceNetConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
