// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JdbcConnectionString")
    public String jdbcConnectionString;

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
