// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class KillProcessRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("InitialQueryId")
    public String initialQueryId;

    @NameInMap("RegionId")
    public String regionId;

    public static KillProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        KillProcessRequest self = new KillProcessRequest();
        return TeaModel.build(map, self);
    }

    public KillProcessRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public KillProcessRequest setInitialQueryId(String initialQueryId) {
        this.initialQueryId = initialQueryId;
        return this;
    }
    public String getInitialQueryId() {
        return this.initialQueryId;
    }

    public KillProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
