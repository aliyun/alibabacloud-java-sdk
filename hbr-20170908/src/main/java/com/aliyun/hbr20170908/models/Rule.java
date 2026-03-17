// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    /**
     * <p>The backup type.</p>
     * <ul>
     * <li>COMPLETE：Full backup.</li>
     * <li>INCREMENTAL：Incremental backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The replication region id.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The retention period of remote backups. Minimum value: 1. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("DestinationRetention")
    public Long destinationRetention;

    /**
     * <p>Whether the plan is disbaled for this data source.</p>
     * <ul>
     * <li><strong>true</strong>: disabled</li>
     * <li><strong>false</strong>: Not disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>Whether do copy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DoCopy")
    public Boolean doCopy;

    /**
     * <p>This parameter indicates the retention period of the backup data. Minimum value: 1. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Retention")
    public Long retention;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-com-backup-20241023-163113</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is returned only if the value of the <strong>RuleType</strong> parameter is <strong>BACKUP</strong>. This parameter indicates the backup schedule settings. Format: <code>I|{startTime}|{interval}</code>. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, <code>I|1631685600|P1D</code> indicates that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
     * <ul>
     * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
     * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>I|1631685600|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    public static Rule build(java.util.Map<String, ?> map) throws Exception {
        Rule self = new Rule();
        return TeaModel.build(map, self);
    }

    public Rule setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public Rule setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public Rule setDestinationRetention(Long destinationRetention) {
        this.destinationRetention = destinationRetention;
        return this;
    }
    public Long getDestinationRetention() {
        return this.destinationRetention;
    }

    public Rule setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public Rule setDoCopy(Boolean doCopy) {
        this.doCopy = doCopy;
        return this;
    }
    public Boolean getDoCopy() {
        return this.doCopy;
    }

    public Rule setRetention(Long retention) {
        this.retention = retention;
        return this;
    }
    public Long getRetention() {
        return this.retention;
    }

    public Rule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public Rule setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

}
