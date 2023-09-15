// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleMax")
    public Long scaleMax;

    @NameInMap("ScaleMin")
    public Long scaleMin;

    public static ModifyDBInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassRequest self = new ModifyDBInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceClassRequest setScaleMax(Long scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Long getScaleMax() {
        return this.scaleMax;
    }

    public ModifyDBInstanceClassRequest setScaleMin(Long scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Long getScaleMin() {
        return this.scaleMin;
    }

}
