// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SwitchGlobalBroadcastTypeRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SwitchGlobalBroadcastTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchGlobalBroadcastTypeRequest self = new SwitchGlobalBroadcastTypeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchGlobalBroadcastTypeRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SwitchGlobalBroadcastTypeRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SwitchGlobalBroadcastTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
