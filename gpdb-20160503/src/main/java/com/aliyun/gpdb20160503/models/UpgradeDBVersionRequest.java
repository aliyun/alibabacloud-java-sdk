// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBVersionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("MajorVersion")
    public String majorVersion;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static UpgradeDBVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBVersionRequest self = new UpgradeDBVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBVersionRequest setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public UpgradeDBVersionRequest setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public UpgradeDBVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeDBVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBVersionRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
