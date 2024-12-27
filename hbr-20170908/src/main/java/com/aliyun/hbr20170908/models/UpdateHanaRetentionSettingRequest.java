// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaRetentionSettingRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-00024vyjj******srrq</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEMDB</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to permanently retain the backup. Valid values:</p>
     * <ul>
     * <li>true: The backup is permanently retained.</li>
     * <li>false: The backup is retained for the specified number of days.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The retention period of the backup data. Unit: days. If you set the Disabled parameter to false, the backup is retained for the number of days specified by this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("RetentionDays")
    public Long retentionDays;

    /**
     * <p>The policy to update the retention period. Format: <code>I|{startTime}|{interval}</code>. The retention period is updated at an interval of {interval} starting from {startTime}.</p>
     * <ul>
     * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
     * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour, and P1D indicates an interval of one day.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I|0|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000fb0v2ly******k6</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateHanaRetentionSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaRetentionSettingRequest self = new UpdateHanaRetentionSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHanaRetentionSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHanaRetentionSettingRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public UpdateHanaRetentionSettingRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdateHanaRetentionSettingRequest setRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Long getRetentionDays() {
        return this.retentionDays;
    }

    public UpdateHanaRetentionSettingRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public UpdateHanaRetentionSettingRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
