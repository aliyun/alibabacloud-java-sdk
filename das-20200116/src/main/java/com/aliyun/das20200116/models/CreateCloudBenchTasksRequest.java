// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The total number of stress testing tasks that you want to create. Valid values: <strong>0</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>229132</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The time when the backup starts. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-23T13:22:14Z</p>
     */
    @NameInMap("BackupTime")
    public String backupTime;

    /**
     * <p>The type of the stress testing client. Valid values:</p>
     * <ul>
     * <li><strong>ECS</strong>: indicates that you must create the <a href="https://help.aliyun.com/document_detail/64905.html">DBGateway</a>.</li>
     * <li><strong>DAS_ECS</strong>: indicates that DAS automatically purchases and deploys an Elastic Compute Service (ECS) instance for stress testing.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The description of the stress testing task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-das-bench-0501</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The endpoint of the destination instance. The specified endpoint must be the endpoint of an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set <strong>DstType</strong> to <strong>ConnectionString</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-de21209****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("DstConnectionString")
    public String dstConnectionString;

    /**
     * <p>The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to query the ID.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    /**
     * <p>The port number of the instance that you want to access.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set <strong>DstType</strong> to <strong>ConnectionString</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>The name of the privileged account for the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    /**
     * <p>The password of the privileged account for the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    /**
     * <p>The type of the identifier that is used to indicate the destination instance. Valid values:</p>
     * <ul>
     * <li><strong>Instance</strong>: the instance ID. This is the default value.</li>
     * <li><strong>ConnectionString</strong>: the endpoint of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("DstType")
    public String dstType;

    /**
     * <p>The specification of the Data Transmission Service (DTS) migration task. You can call the <a href="https://help.aliyun.com/document_detail/230669.html">DescribeCloudbenchTask</a> operation to query the specification.</p>
     * <blockquote>
     * <p> You must migrate the basic data in the source instance to the destination instance before you start a stress testing task. When you create a DTS migration task, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    /**
     * <p>The ID of the DTS migration task. You can call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to query the ID.</p>
     * <blockquote>
     * <p> After a DTS migration task is created in the DTS console, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23127</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The state that specifies the last operation that is performed for the stress testing task. Valid values:</p>
     * <ul>
     * <li><strong>WAIT_TARGET</strong>: prepares the destination instance</li>
     * <li><strong>WAIT_DBGATEWAY</strong>: prepares the DBGateway</li>
     * <li><strong>WAIT_SQL</strong>: prepares the full SQL statistics</li>
     * <li><strong>WAIT_LOGIC</strong>: prepares to replay the traffic</li>
     * </ul>
     * <blockquote>
     * <p> When the state of a stress testing task changes to the state that is specified by the EndState parameter, the stress testing task becomes completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WAIT_TARGET</p>
     */
    @NameInMap("EndState")
    public String endState;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the database gateway (DBGateway) is deployed.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>ClientType</strong> to <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nsnwvpbc1h76ja4****</p>
     */
    @NameInMap("GatewayVpcId")
    public String gatewayVpcId;

    /**
     * <p>The IP address or domain name of the DBGateway.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>ClientType</strong> to <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.30.XX.XX</p>
     */
    @NameInMap("GatewayVpcIp")
    public String gatewayVpcIp;

    /**
     * <p>The rate at which the traffic captured from the source instance is replayed on the destination instance. The value must be a positive integer. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rate")
    public String rate;

    /**
     * <p>The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("RequestDuration")
    public String requestDuration;

    /**
     * <p>The time when the stress testing task ends. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296001</p>
     */
    @NameInMap("RequestEndTime")
    public String requestEndTime;

    /**
     * <p>The time when the stress testing task starts. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("RequestStartTime")
    public String requestStartTime;

    /**
     * <p>The duration within which the traffic generation stressing test takes effect. Unit: milliseconds.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>TaskType</strong> to <strong>smart pressure test</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("SmartPressureTime")
    public String smartPressureTime;

    /**
     * <p>The ID of the source instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to query the ID.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("SrcInstanceId")
    public String srcInstanceId;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SrcPublicIp")
    public String srcPublicIp;

    /**
     * <p>The name of the privileged account for the source instance. Set the value to <strong>admin</strong>.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("SrcSuperAccount")
    public String srcSuperAccount;

    /**
     * <p>The password of the privileged account for the source instance.</p>
     * <blockquote>
     * <p> This parameter must be specified if you set <strong>DstType</strong> to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("SrcSuperPassword")
    public String srcSuperPassword;

    /**
     * <p>The type of the stress testing task. Valid values:</p>
     * <ul>
     * <li><strong>pressure test</strong> (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</li>
     * <li><strong>smart pressure test</strong>: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pressure test</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The temporary directory generated for stress testing.</p>
     * 
     * <strong>example:</strong>
     * <p>/tmp/bench/</p>
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
