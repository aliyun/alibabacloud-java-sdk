// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The total number of stress testing tasks that you want to create. Valid values: **0** to **30**. Default value: **1**.</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The time when the backup starts. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("BackupTime")
    public String backupTime;

    /**
     * <p>The type of the stress testing client. Valid values:</p>
     * <br>
     * <p>*   **ECS**: indicates that you must create the [DBGateway](~~64905~~).</p>
     * <p>*   **DAS_ECS**: indicates that DAS automatically purchases and deploys an Elastic Compute Service (ECS) instance for stress testing.</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The description of the stress testing task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The endpoint of the destination instance. The specified endpoint must be the endpoint of an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set **DstType** to **ConnectionString**.</p>
     */
    @NameInMap("DstConnectionString")
    public String dstConnectionString;

    /**
     * <p>The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](~~202857~~) operation to query the ID.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **DstType** to **Instance**.</p>
     */
    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    /**
     * <p>The port number of the instance that you want to access.</p>
     * <br>
     * <p>>  This parameter takes effect only if you set **DstType** to **ConnectionString**.</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>The name of the privileged account for the destination instance.</p>
     */
    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    /**
     * <p>The password of the privileged account for the destination instance.</p>
     */
    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    /**
     * <p>The type of the identifier that is used to indicate the destination instance. Valid values:</p>
     * <br>
     * <p>*   **Instance**: the instance ID. This is the default value.</p>
     * <p>*   **ConnectionString**: the endpoint of the instance.</p>
     */
    @NameInMap("DstType")
    public String dstType;

    /**
     * <p>The specification of the Data Transmission Service (DTS) migration task. You can call the [DescribeCloudbenchTask](~~230669~~) operation to query the specification.</p>
     * <br>
     * <p>>  You must migrate the basic data in the source instance to the destination instance before you start a stress testing task. When you create a DTS migration task, you must specify this parameter.</p>
     */
    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    /**
     * <p>The ID of the DTS migration task. You can call the [ConfigureDtsJob](~~208399~~) operation to query the ID.</p>
     * <br>
     * <p>>  After a DTS migration task is created in the DTS console, you must specify this parameter.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The state that specifies the last operation that is performed for the stress testing task. Valid values:</p>
     * <br>
     * <p>*   **WAIT_TARGET**: prepares the destination instance</p>
     * <p>*   **WAIT_DBGATEWAY**: prepares the DBGateway</p>
     * <p>*   **WAIT_SQL**: prepares the full SQL statistics</p>
     * <p>*   **WAIT_LOGIC**: prepares to replay the traffic</p>
     * <br>
     * <p>>  When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task becomes completed.</p>
     */
    @NameInMap("EndState")
    public String endState;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the database gateway (DBGateway) is deployed.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **ClientType** to **ECS**.</p>
     */
    @NameInMap("GatewayVpcId")
    public String gatewayVpcId;

    /**
     * <p>The IP address or domain name of the DBGateway.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **ClientType** to **ECS**.</p>
     */
    @NameInMap("GatewayVpcIp")
    public String gatewayVpcIp;

    /**
     * <p>The rate at which the traffic captured from the source instance is replayed on the destination instance. The value must be a positive integer. Valid values: **1** to **30**. Default value: **1**.</p>
     */
    @NameInMap("Rate")
    public String rate;

    /**
     * <p>The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.</p>
     */
    @NameInMap("RequestDuration")
    public String requestDuration;

    /**
     * <p>The time when the stress testing task ends. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("RequestEndTime")
    public String requestEndTime;

    /**
     * <p>The time when the stress testing task starts. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("RequestStartTime")
    public String requestStartTime;

    /**
     * <p>The duration within which the traffic generation stressing test takes effect. Unit: milliseconds.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **TaskType** to **smart pressure test**.</p>
     */
    @NameInMap("SmartPressureTime")
    public String smartPressureTime;

    /**
     * <p>The ID of the source instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](~~202857~~) operation to query the ID.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **DstType** to **Instance**.</p>
     */
    @NameInMap("SrcInstanceId")
    public String srcInstanceId;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("SrcPublicIp")
    public String srcPublicIp;

    /**
     * <p>The name of the privileged account for the source instance. Set the value to **admin**.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **DstType** to **Instance**.</p>
     */
    @NameInMap("SrcSuperAccount")
    public String srcSuperAccount;

    /**
     * <p>The password of the privileged account for the source instance.</p>
     * <br>
     * <p>>  This parameter must be specified if you set **DstType** to **Instance**.</p>
     */
    @NameInMap("SrcSuperPassword")
    public String srcSuperPassword;

    /**
     * <p>The type of the stress testing task. Valid values:</p>
     * <br>
     * <p>*   **pressure test** (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</p>
     * <p>*   **smart pressure test**: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The temporary directory generated for stress testing.</p>
     */
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
