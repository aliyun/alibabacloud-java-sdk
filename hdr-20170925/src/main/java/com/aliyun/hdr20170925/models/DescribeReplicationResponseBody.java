// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationResponseBody extends TeaModel {
    @NameInMap("Applications")
    public String applications;

    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayName")
    public String gatewayName;

    @NameInMap("InstanceIp")
    public String instanceIp;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Message")
    public String message;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("ProtectedTime")
    public Long protectedTime;

    @NameInMap("ReplicationId")
    public String replicationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeReplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationResponseBody self = new DescribeReplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationResponseBody setApplications(String applications) {
        this.applications = applications;
        return this;
    }
    public String getApplications() {
        return this.applications;
    }

    public DescribeReplicationResponseBody setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public DescribeReplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeReplicationResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeReplicationResponseBody setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public DescribeReplicationResponseBody setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeReplicationResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeReplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeReplicationResponseBody setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeReplicationResponseBody setProtectedTime(Long protectedTime) {
        this.protectedTime = protectedTime;
        return this;
    }
    public Long getProtectedTime() {
        return this.protectedTime;
    }

    public DescribeReplicationResponseBody setReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }
    public String getReplicationId() {
        return this.replicationId;
    }

    public DescribeReplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeReplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
