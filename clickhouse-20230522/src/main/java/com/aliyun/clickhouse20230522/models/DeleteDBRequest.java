// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteDBRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBRequest self = new DeleteDBRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DeleteDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
