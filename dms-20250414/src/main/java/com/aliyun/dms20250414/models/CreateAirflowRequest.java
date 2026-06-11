// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowRequest extends TeaModel {
    /**
     * <p>The name of the Airflow instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testairflow</p>
     */
    @NameInMap("AirflowName")
    public String airflowName;

    /**
     * <p>The Airflow version. Supported versions: 2.10 and 3.1.</p>
     * 
     * <strong>example:</strong>
     * <p>3.1</p>
     */
    @NameInMap("AirflowVersion")
    public String airflowVersion;

    /**
     * <p>The compute specifications for the Airflow instance. Valid values: <strong>SMALL</strong>, <strong>MEDIUM</strong>, <strong>LARGE</strong>, <strong>XLARGE</strong>, or <strong>X2LARGE</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMALL</p>
     */
    @NameInMap("AppSpec")
    public String appSpec;

    /**
     * <p>A client token to ensure request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>token-****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The path to the DAG directory for Airflow to scan.</p>
     * 
     * <strong>example:</strong>
     * <p>default/dags</p>
     */
    @NameInMap("DagsDir")
    public String dagsDir;

    /**
     * <p>A list of data mount configurations.</p>
     */
    @NameInMap("DataMountInfoList")
    public java.util.List<DataMountInfo> dataMountInfoList;

    /**
     * <p>The description of the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>order scheduler</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable worker elasticity.</p>
     */
    @NameInMap("EnableServerless")
    public Boolean enableServerless;

    /**
     * <p>The graceful shutdown timeout for workers, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("GracefulShutdownTimeout")
    public Integer gracefulShutdownTimeout;

    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-test</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The OSS path for log storage.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/airflow</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    /**
     * <p>The path to the plugin directory for the Airflow instance to scan.</p>
     * 
     * <strong>example:</strong>
     * <p>default/plugins</p>
     */
    @NameInMap("PluginsDir")
    public String pluginsDir;

    /**
     * <p>The path to the Python requirements file.</p>
     * 
     * <strong>example:</strong>
     * <p>default/requirements.txt</p>
     */
    @NameInMap("RequirementFile")
    public String requirementFile;

    /**
     * <p>The security group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp108t8ldzeyk1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The path to the startup script in the Airflow container.</p>
     * 
     * <strong>example:</strong>
     * <p>default/startup.sh</p>
     */
    @NameInMap("StartupFile")
    public String startupFile;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vbaf073jawozfp****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf63r6coyiw9o5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The number of elastic worker nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WorkerServerlessReplicas")
    public Integer workerServerlessReplicas;

    /**
     * <p>The ID of the DMS workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The ID of the zone where the instance will be created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateAirflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowRequest self = new CreateAirflowRequest();
        return TeaModel.build(map, self);
    }

    public CreateAirflowRequest setAirflowName(String airflowName) {
        this.airflowName = airflowName;
        return this;
    }
    public String getAirflowName() {
        return this.airflowName;
    }

    public CreateAirflowRequest setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
        return this;
    }
    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    public CreateAirflowRequest setAppSpec(String appSpec) {
        this.appSpec = appSpec;
        return this;
    }
    public String getAppSpec() {
        return this.appSpec;
    }

    public CreateAirflowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAirflowRequest setDagsDir(String dagsDir) {
        this.dagsDir = dagsDir;
        return this;
    }
    public String getDagsDir() {
        return this.dagsDir;
    }

    public CreateAirflowRequest setDataMountInfoList(java.util.List<DataMountInfo> dataMountInfoList) {
        this.dataMountInfoList = dataMountInfoList;
        return this;
    }
    public java.util.List<DataMountInfo> getDataMountInfoList() {
        return this.dataMountInfoList;
    }

    public CreateAirflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAirflowRequest setEnableServerless(Boolean enableServerless) {
        this.enableServerless = enableServerless;
        return this;
    }
    public Boolean getEnableServerless() {
        return this.enableServerless;
    }

    public CreateAirflowRequest setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
        return this;
    }
    public Integer getGracefulShutdownTimeout() {
        return this.gracefulShutdownTimeout;
    }

    public CreateAirflowRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateAirflowRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreateAirflowRequest setPluginsDir(String pluginsDir) {
        this.pluginsDir = pluginsDir;
        return this;
    }
    public String getPluginsDir() {
        return this.pluginsDir;
    }

    public CreateAirflowRequest setRequirementFile(String requirementFile) {
        this.requirementFile = requirementFile;
        return this;
    }
    public String getRequirementFile() {
        return this.requirementFile;
    }

    public CreateAirflowRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateAirflowRequest setStartupFile(String startupFile) {
        this.startupFile = startupFile;
        return this;
    }
    public String getStartupFile() {
        return this.startupFile;
    }

    public CreateAirflowRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateAirflowRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateAirflowRequest setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
        this.workerServerlessReplicas = workerServerlessReplicas;
        return this;
    }
    public Integer getWorkerServerlessReplicas() {
        return this.workerServerlessReplicas;
    }

    public CreateAirflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateAirflowRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
