// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksRequest extends TeaModel {
    @NameInMap("Amount")
    public String amount;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupTime")
    public String backupTime;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("Description")
    public String description;

    @NameInMap("DstConnectionString")
    public String dstConnectionString;

    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    @NameInMap("DstPort")
    public String dstPort;

    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    @NameInMap("DstType")
    public String dstType;

    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("EndState")
    public String endState;

    @NameInMap("GatewayVpcId")
    public String gatewayVpcId;

    @NameInMap("GatewayVpcIp")
    public String gatewayVpcIp;

    @NameInMap("Rate")
    public String rate;

    @NameInMap("RequestDuration")
    public String requestDuration;

    @NameInMap("RequestEndTime")
    public String requestEndTime;

    @NameInMap("RequestStartTime")
    public String requestStartTime;

    @NameInMap("SmartPressureTime")
    public String smartPressureTime;

    @NameInMap("SrcInstanceId")
    public String srcInstanceId;

    @NameInMap("SrcPublicIp")
    public String srcPublicIp;

    @NameInMap("SrcSuperAccount")
    public String srcSuperAccount;

    @NameInMap("SrcSuperPassword")
    public String srcSuperPassword;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("WorkDir")
    public String workDir;

    public static CreateCloudBenchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudBenchTasksRequest self = new CreateCloudBenchTasksRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudBenchTasksRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateCloudBenchTasksRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateCloudBenchTasksRequest setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }
    public String getBackupTime() {
        return this.backupTime;
    }

    public CreateCloudBenchTasksRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public CreateCloudBenchTasksRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudBenchTasksRequest setDstConnectionString(String dstConnectionString) {
        this.dstConnectionString = dstConnectionString;
        return this;
    }
    public String getDstConnectionString() {
        return this.dstConnectionString;
    }

    public CreateCloudBenchTasksRequest setDstInstanceId(String dstInstanceId) {
        this.dstInstanceId = dstInstanceId;
        return this;
    }
    public String getDstInstanceId() {
        return this.dstInstanceId;
    }

    public CreateCloudBenchTasksRequest setDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public String getDstPort() {
        return this.dstPort;
    }

    public CreateCloudBenchTasksRequest setDstSuperAccount(String dstSuperAccount) {
        this.dstSuperAccount = dstSuperAccount;
        return this;
    }
    public String getDstSuperAccount() {
        return this.dstSuperAccount;
    }

    public CreateCloudBenchTasksRequest setDstSuperPassword(String dstSuperPassword) {
        this.dstSuperPassword = dstSuperPassword;
        return this;
    }
    public String getDstSuperPassword() {
        return this.dstSuperPassword;
    }

    public CreateCloudBenchTasksRequest setDstType(String dstType) {
        this.dstType = dstType;
        return this;
    }
    public String getDstType() {
        return this.dstType;
    }

    public CreateCloudBenchTasksRequest setDtsJobClass(String dtsJobClass) {
        this.dtsJobClass = dtsJobClass;
        return this;
    }
    public String getDtsJobClass() {
        return this.dtsJobClass;
    }

    public CreateCloudBenchTasksRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateCloudBenchTasksRequest setEndState(String endState) {
        this.endState = endState;
        return this;
    }
    public String getEndState() {
        return this.endState;
    }

    public CreateCloudBenchTasksRequest setGatewayVpcId(String gatewayVpcId) {
        this.gatewayVpcId = gatewayVpcId;
        return this;
    }
    public String getGatewayVpcId() {
        return this.gatewayVpcId;
    }

    public CreateCloudBenchTasksRequest setGatewayVpcIp(String gatewayVpcIp) {
        this.gatewayVpcIp = gatewayVpcIp;
        return this;
    }
    public String getGatewayVpcIp() {
        return this.gatewayVpcIp;
    }

    public CreateCloudBenchTasksRequest setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public CreateCloudBenchTasksRequest setRequestDuration(String requestDuration) {
        this.requestDuration = requestDuration;
        return this;
    }
    public String getRequestDuration() {
        return this.requestDuration;
    }

    public CreateCloudBenchTasksRequest setRequestEndTime(String requestEndTime) {
        this.requestEndTime = requestEndTime;
        return this;
    }
    public String getRequestEndTime() {
        return this.requestEndTime;
    }

    public CreateCloudBenchTasksRequest setRequestStartTime(String requestStartTime) {
        this.requestStartTime = requestStartTime;
        return this;
    }
    public String getRequestStartTime() {
        return this.requestStartTime;
    }

    public CreateCloudBenchTasksRequest setSmartPressureTime(String smartPressureTime) {
        this.smartPressureTime = smartPressureTime;
        return this;
    }
    public String getSmartPressureTime() {
        return this.smartPressureTime;
    }

    public CreateCloudBenchTasksRequest setSrcInstanceId(String srcInstanceId) {
        this.srcInstanceId = srcInstanceId;
        return this;
    }
    public String getSrcInstanceId() {
        return this.srcInstanceId;
    }

    public CreateCloudBenchTasksRequest setSrcPublicIp(String srcPublicIp) {
        this.srcPublicIp = srcPublicIp;
        return this;
    }
    public String getSrcPublicIp() {
        return this.srcPublicIp;
    }

    public CreateCloudBenchTasksRequest setSrcSuperAccount(String srcSuperAccount) {
        this.srcSuperAccount = srcSuperAccount;
        return this;
    }
    public String getSrcSuperAccount() {
        return this.srcSuperAccount;
    }

    public CreateCloudBenchTasksRequest setSrcSuperPassword(String srcSuperPassword) {
        this.srcSuperPassword = srcSuperPassword;
        return this;
    }
    public String getSrcSuperPassword() {
        return this.srcSuperPassword;
    }

    public CreateCloudBenchTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateCloudBenchTasksRequest setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

}
