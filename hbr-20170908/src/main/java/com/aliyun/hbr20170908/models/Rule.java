// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("DestinationRetention")
    public Long destinationRetention;

    @NameInMap("Disabled")
    public Boolean disabled;

    @NameInMap("DoCopy")
    public Boolean doCopy;

    @NameInMap("Retention")
    public Long retention;

    @NameInMap("RuleName")
    public String ruleName;

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
