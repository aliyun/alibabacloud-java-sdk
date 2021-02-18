// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureMigrationJobAlertRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static ConfigureMigrationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureMigrationJobAlertRequest self = new ConfigureMigrationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureMigrationJobAlertRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public ConfigureMigrationJobAlertRequest setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public ConfigureMigrationJobAlertRequest setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public ConfigureMigrationJobAlertRequest setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public ConfigureMigrationJobAlertRequest setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public ConfigureMigrationJobAlertRequest setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public ConfigureMigrationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureMigrationJobAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
