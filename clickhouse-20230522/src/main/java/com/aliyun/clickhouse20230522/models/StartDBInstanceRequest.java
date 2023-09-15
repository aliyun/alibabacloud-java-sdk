// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class StartDBInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static StartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceRequest self = new StartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public StartDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
