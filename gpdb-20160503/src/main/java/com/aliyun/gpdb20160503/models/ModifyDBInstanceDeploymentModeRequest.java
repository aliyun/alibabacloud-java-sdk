// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeploymentModeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The deployment mode. Valid values:</p>
     * <ul>
     * <li>multiple: multi-zone deployment.</li>
     * <li>single: single-zone deployment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>multiple</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The vSwitch ID in the secondary zone.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only for multi-zone deployment.</li>
     * <li>The zone of the vSwitch specified by this parameter must be the same as the zone specified by StandbyZoneId.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <p>The secondary zone ID.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required only for multi-zone deployment.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</li>
     * <li>The secondary zone ID must be different from the primary zone ID.</li>
     * </ul>
     * </blockquote>
     * 
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
