// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaRetentionSettingRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to permanently retain the backup. Valid values:</p>
     * <br>
     * <p>*   true: The backup is permanently retained.</p>
     * <p>*   false: The backup is retained for the specified number of days.</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The number of days for which the backup is retained. If you set the Disabled parameter to false, the backup is retained for the number of days specified by this parameter.</p>
     */
    @NameInMap("RetentionDays")
    public Long retentionDays;

    /**
     * <p>The policy to update the retention period. Format: `I|{startTime}|{interval}`. The retention period is updated at an interval of {interval} starting from {startTime}.</p>
     * <br>
     * <p>*   startTime: the time at which the system starts to update the retention period. The time must follow the UNIX time format. Unit: seconds.</p>
     * <p>*   interval: the interval at which the system updates the retention period. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of 1 hour and P1D specifies an interval of one day.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The ID of the backup vault.</p>
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
