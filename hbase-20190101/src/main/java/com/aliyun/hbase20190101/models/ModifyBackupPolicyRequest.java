// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The UTC time when the backup ends.</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("PreferredBackupEndTimeUTC")
    public String preferredBackupEndTimeUTC;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li>Monday: performs backup every Monday.</li>
     * <li>Tuesday: performs backup every Tuesday.</li>
     * <li>Wednesday: performs backup every Wednesday.</li>
     * <li>Thursday: performs backup every Thursday.</li>
     * <li>Friday: performs backup every Friday.</li>
     * <li>Saturday: performs backup every Saturday.</li>
     * <li>Sunday: performs backup every Sunday.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Thursday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The UTC time when the backup starts.</p>
     * 
     * <strong>example:</strong>
     * <p>17:00Z</p>
     */
    @NameInMap("PreferredBackupStartTimeUTC")
    public String preferredBackupStartTimeUTC;

    /**
     * <p>The backup time range in the current time zone. The interval is 1 hour.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01:00-02:00</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyBackupPolicyRequest setPreferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
        this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
        return this;
    }
    public String getPreferredBackupEndTimeUTC() {
        return this.preferredBackupEndTimeUTC;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
        this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
        return this;
    }
    public String getPreferredBackupStartTimeUTC() {
        return this.preferredBackupStartTimeUTC;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

}
