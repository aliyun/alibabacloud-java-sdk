// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeploymentModeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>multiple</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    public static ModifyDBInstanceDeploymentModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDeploymentModeRequest self = new ModifyDBInstanceDeploymentModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDeploymentModeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceDeploymentModeRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public ModifyDBInstanceDeploymentModeRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public ModifyDBInstanceDeploymentModeRequest setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

}
