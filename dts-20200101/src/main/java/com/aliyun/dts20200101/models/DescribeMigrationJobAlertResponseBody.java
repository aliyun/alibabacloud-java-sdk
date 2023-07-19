// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobAlertResponseBody extends TeaModel {
    /**
     * <p>The mobile phone numbers that receive latency-related alerts.</p>
     */
    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    /**
     * <p>Indicates whether task latency is monitored. Valid values:</p>
     * <br>
     * <p>*   **enable**: yes</p>
     * <p>*   **disable**: no</p>
     */
    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    /**
     * <p>The threshold for triggering latency alerts. Unit: seconds.</p>
     */
    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The mobile phone numbers that receive status-related alerts.</p>
     */
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    /**
     * <p>Indicates whether task status is monitored. Valid values:</p>
     * <br>
     * <p>*   **enable**: yes</p>
     * <p>*   **disable**: no</p>
     */
    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    /**
     * <p>The ID of the data migration instance.</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    /**
     * <p>The name of the data migration task.</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeMigrationJobAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobAlertResponseBody self = new DescribeMigrationJobAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobAlertResponseBody setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public DescribeMigrationJobAlertResponseBody setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public DescribeMigrationJobAlertResponseBody setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public DescribeMigrationJobAlertResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeMigrationJobAlertResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeMigrationJobAlertResponseBody setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public DescribeMigrationJobAlertResponseBody setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public DescribeMigrationJobAlertResponseBody setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DescribeMigrationJobAlertResponseBody setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public DescribeMigrationJobAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationJobAlertResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
