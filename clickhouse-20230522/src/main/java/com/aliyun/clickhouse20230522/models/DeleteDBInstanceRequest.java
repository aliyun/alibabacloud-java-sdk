// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceRequest self = new DeleteDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
