// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The total number of stress testing tasks to create. Valid values: <strong>0</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the backup list and obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>229132</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The time of the backup. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-04-23T13:22:14Z</p>
     */
    @NameInMap("BackupTime")
    public String backupTime;

    /**
     * <p>The type of stress testing machine. Valid values:</p>
     * <ul>
     * <li><p><strong>ECS</strong>: You need to prepare a <a href="https://help.aliyun.com/document_detail/64905.html">Database Gateway</a> yourself.</p>
     * </li>
     * <li><p><strong>DAS_ECS</strong>: An ECS instance that is automatically purchased and deployed by DAS.</p>
     * </li>
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
     * <p>The connection address of the target instance. Only RDS MySQL and PolarDB MySQL instances are supported.</p>
     * <blockquote>
     * <p>This parameter takes effect when <strong>DstType</strong> is set to <strong>ConnectionString</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-de21209****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("DstConnectionString")
    public String dstConnectionString;

    /**
     * <p>The ID of the target instance. Only RDS MySQL and PolarDB MySQL instances are supported. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DstType</strong> is set to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    /**
     * <p>The port of the target instance.</p>
     * <blockquote>
     * <p>This parameter takes effect when <strong>DstType</strong> is set to <strong>ConnectionString</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <p>The privileged account of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    /**
     * <p>The password of the privileged account of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    /**
     * <p>The type of the target instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Instance</strong> (default): instance ID.</p>
     * </li>
     * <li><p><strong>ConnectionString</strong>: connection address of the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("DstType")
    public String dstType;

    /**
     * <p>The specification of the DTS migration task. You can call the <a href="https://help.aliyun.com/document_detail/230669.html">DescribeCloudbenchTask</a> operation to obtain the specification.</p>
     * <blockquote>
     * <p>The stress testing task needs to migrate the baseline data from the source instance to the target instance. This parameter is required when you create a new DTS task.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("DtsJobClass")
    public String dtsJobClass;

    /**
     * <p>The ID of the DTS migration task. You can call the <a href="https://help.aliyun.com/document_detail/208399.html">ConfigureDtsJob</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p>This parameter is required when a DTS task has been created in the DTS console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23127</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The status after the stress testing task ends. Valid values:</p>
     * <ul>
     * <li><p><strong>WAIT_TARGET</strong>: Prepare the target instance for stress testing.</p>
     * </li>
     * <li><p><strong>WAIT_DBGATEWAY</strong>: Prepare the stress testing deployment.</p>
     * </li>
     * <li><p><strong>WAIT_SQL</strong>: Prepare the full SQL statements.</p>
     * </li>
     * <li><p><strong>WAIT_LOGIC</strong>: Prepare to start replaying the traffic.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When the stress testing task completes the status set by EndState, the task directly reaches the completed status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WAIT_TARGET</p>
     */
    @NameInMap("EndState")
    public String endState;

    /**
     * <p>The virtual private cloud (VPC) ID of the Database Gateway.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ClientType</strong> is set to <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nsnwvpbc1h76ja4****</p>
     */
    @NameInMap("GatewayVpcId")
    public String gatewayVpcId;

    /**
     * <p>The IP address or domain name of the Database Gateway.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ClientType</strong> is set to <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>172.30.XX.XX</p>
     */
    @NameInMap("GatewayVpcIp")
    public String gatewayVpcIp;

    /**
     * <p>The replay speed of the source instance traffic on the target instance. The replay speed must be a positive integer. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rate")
    public String rate;

    /**
     * <p>The duration of the stress testing task. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("RequestDuration")
    public String requestDuration;

    /**
     * <p>The end time of the stress testing task. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296001</p>
     */
    @NameInMap("RequestEndTime")
    public String requestEndTime;

    /**
     * <p>The start time of the stress testing task. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("RequestStartTime")
    public String requestStartTime;

    /**
     * <p>The duration of the generated stress testing. Unit: milliseconds.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>TaskType</strong> is set to <strong>smart pressure test</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400000</p>
     */
    @NameInMap("SmartPressureTime")
    public String smartPressureTime;

    /**
     * <p>The ID of the source instance. Only RDS MySQL and PolarDB MySQL instances are supported. You can call the <a href="https://help.aliyun.com/document_detail/202857.html">GetInstanceInspections</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DstType</strong> is set to <strong>Instance</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("SrcInstanceId")
    public String srcInstanceId;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SrcPublicIp")
    public String srcPublicIp;

    /**
     * <p>The privileged account of the source instance. Value: <strong>admin</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DstType</strong> is set to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("SrcSuperAccount")
    public String srcSuperAccount;

    /**
     * <p>The password of the privileged account of the source instance.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DstType</strong> is set to <strong>Instance</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("SrcSuperPassword")
    public String srcSuperPassword;

    /**
     * <p>The type of stress testing task. Valid values:</p>
     * <ul>
     * <li><p><strong>pressure test</strong> (default): Intelligent stress testing, which replays the traffic captured from the source instance on the target instance at the maximum speed supported by the target instance type.</p>
     * </li>
     * <li><p><strong>smart pressure test</strong>: Generated stress testing, which analyzes and learns from the traffic captured from the source instance in a short period of time, generates traffic that is consistent with the business model and traffic distribution of the original traffic for continuous stress testing, reduces the time for collecting data from the source instance, and reduces storage costs and performance overhead.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pressure test</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The temporary directory generated by the stress testing.</p>
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
