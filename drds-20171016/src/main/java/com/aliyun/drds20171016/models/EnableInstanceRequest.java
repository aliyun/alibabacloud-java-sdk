// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class EnableInstanceRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbInstanceClass")
    public String dbInstanceClass;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDbInstId")
    public String sourceDbInstId;

    @NameInMap("SwitchId")
    public String switchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static EnableInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceRequest self = new EnableInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EnableInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public EnableInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableInstanceRequest setDbInstanceClass(String dbInstanceClass) {
        this.dbInstanceClass = dbInstanceClass;
        return this;
    }
    public String getDbInstanceClass() {
        return this.dbInstanceClass;
    }

    public EnableInstanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public EnableInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EnableInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public EnableInstanceRequest setSourceDbInstId(String sourceDbInstId) {
        this.sourceDbInstId = sourceDbInstId;
        return this;
    }
    public String getSourceDbInstId() {
        return this.sourceDbInstId;
    }

    public EnableInstanceRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public EnableInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public EnableInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
