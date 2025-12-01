// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class RenewBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01e****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>HKAJHFIUEQWBFIJSNFO****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Specifies whether to use yearly subscription or monthly subscription for the instance. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The subscription duration of the instance. Valid values:</p>
     * <ul>
     * <li>If the Period parameter is set to Year, the value of the UsedTime parameter ranges from 1 to 9.</li>
     * <li>If the Period parameter is set to Month, the value of the UsedTime parameter ranges from 1 to 11.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static RenewBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewBackupPlanRequest self = new RenewBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public RenewBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public RenewBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public RenewBackupPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RenewBackupPlanRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
