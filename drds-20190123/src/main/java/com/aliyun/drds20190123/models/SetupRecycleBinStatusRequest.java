// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupRecycleBinStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("StatusAction")
    @Validation(required = true)
    public String statusAction;

    public static SetupRecycleBinStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupRecycleBinStatusRequest self = new SetupRecycleBinStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetupRecycleBinStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupRecycleBinStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupRecycleBinStatusRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupRecycleBinStatusRequest setStatusAction(String statusAction) {
        this.statusAction = statusAction;
        return this;
    }
    public String getStatusAction() {
        return this.statusAction;
    }

}
