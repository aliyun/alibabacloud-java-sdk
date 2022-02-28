// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponseBody extends TeaModel {
    @NameInMap("BackupWorkload")
    public Integer backupWorkload;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreatedTime")
    public Long createdTime;

    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("GatewayDescription")
    public String gatewayDescription;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayIp")
    public String gatewayIp;

    @NameInMap("GatewayName")
    public String gatewayName;

    @NameInMap("MCInstanceId")
    public String MCInstanceId;

    @NameInMap("McPassword")
    public String mcPassword;

    @NameInMap("McUsername")
    public String mcUsername;

    @NameInMap("Message")
    public String message;

    @NameInMap("RecoveryWorkload")
    public Integer recoveryWorkload;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SiteName")
    public String siteName;

    @NameInMap("SitePairId")
    public String sitePairId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StoreInstanceId")
    public String storeInstanceId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponseBody self = new DescribeGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponseBody setBackupWorkload(Integer backupWorkload) {
        this.backupWorkload = backupWorkload;
        return this;
    }
    public Integer getBackupWorkload() {
        return this.backupWorkload;
    }

    public DescribeGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeGatewayResponseBody setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DescribeGatewayResponseBody setGatewayDescription(String gatewayDescription) {
        this.gatewayDescription = gatewayDescription;
        return this;
    }
    public String getGatewayDescription() {
        return this.gatewayDescription;
    }

    public DescribeGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayResponseBody setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }
    public String getGatewayIp() {
        return this.gatewayIp;
    }

    public DescribeGatewayResponseBody setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public DescribeGatewayResponseBody setMCInstanceId(String MCInstanceId) {
        this.MCInstanceId = MCInstanceId;
        return this;
    }
    public String getMCInstanceId() {
        return this.MCInstanceId;
    }

    public DescribeGatewayResponseBody setMcPassword(String mcPassword) {
        this.mcPassword = mcPassword;
        return this;
    }
    public String getMcPassword() {
        return this.mcPassword;
    }

    public DescribeGatewayResponseBody setMcUsername(String mcUsername) {
        this.mcUsername = mcUsername;
        return this;
    }
    public String getMcUsername() {
        return this.mcUsername;
    }

    public DescribeGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayResponseBody setRecoveryWorkload(Integer recoveryWorkload) {
        this.recoveryWorkload = recoveryWorkload;
        return this;
    }
    public Integer getRecoveryWorkload() {
        return this.recoveryWorkload;
    }

    public DescribeGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public DescribeGatewayResponseBody setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

    public DescribeGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGatewayResponseBody setStoreInstanceId(String storeInstanceId) {
        this.storeInstanceId = storeInstanceId;
        return this;
    }
    public String getStoreInstanceId() {
        return this.storeInstanceId;
    }

    public DescribeGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
