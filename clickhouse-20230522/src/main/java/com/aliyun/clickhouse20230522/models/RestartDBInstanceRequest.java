// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class RestartDBInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static RestartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceRequest self = new RestartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestartDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
