// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupRecycleBinStatusRequest extends TeaModel {
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

    /**
     * <p>Specifies the status of the table recycle bin. Valid values:</p>
     * <br>
     * <p>*   enable: The table recycle bin is enabled.</p>
     * <p>*   disable: The table recycle bin is disabled.</p>
     */
    @NameInMap("StatusAction")
    public String statusAction;

    public static SetupRecycleBinStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupRecycleBinStatusRequest self = new SetupRecycleBinStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetupRecycleBinStatusRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupRecycleBinStatusRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupRecycleBinStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupRecycleBinStatusRequest setStatusAction(String statusAction) {
        this.statusAction = statusAction;
        return this;
    }
    public String getStatusAction() {
        return this.statusAction;
    }

}
