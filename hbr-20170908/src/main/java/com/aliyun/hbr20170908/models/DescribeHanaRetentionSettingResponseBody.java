// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRetentionSettingResponseBody extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-0003jyv******fsku5m</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>Q01</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Indicates whether the backup is permanently retained. Valid values:</p>
     * <ul>
     * <li>true: The backup is permanently retained.</li>
     * <li>false: The backup is retained for the specified number of days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>280DD872-EE25-52E8-9CB4-491067173DD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of days for which the backup is retained. If the value of the Disabled parameter is false, the backup is retained for the number of days specified by this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>3650</p>
     */
    @NameInMap("RetentionDays")
    public Long retentionDays;

    /**
     * <p>The policy to update the retention period. Format: <code>I|{startTime}|{interval}</code>, which indicates that the retention period is updated at an interval of {interval} starting from {startTime}.</p>
     * <ul>
     * <li>startTime: the time at which the system starts to run a backup job. The time follows the UNIX time format. Unit: seconds.</li>
     * <li>interval: the interval at which the system runs a backup job. The interval follows the ISO 8601 standard. For example, PT1H indicates an interval of 1 hour. P1D indicates an interval of one day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>I|0|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0006wkn7******zkn</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DescribeHanaRetentionSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRetentionSettingResponseBody self = new DescribeHanaRetentionSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRetentionSettingResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHanaRetentionSettingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaRetentionSettingResponseBody setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeHanaRetentionSettingResponseBody setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public DescribeHanaRetentionSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaRetentionSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaRetentionSettingResponseBody setRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Long getRetentionDays() {
        return this.retentionDays;
    }

    public DescribeHanaRetentionSettingResponseBody setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public DescribeHanaRetentionSettingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHanaRetentionSettingResponseBody setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
