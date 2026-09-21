// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAirflowShrinkRequest extends TeaModel {
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
     * <p>The Airflow version. Valid values: &quot;3.2.2&quot;, &quot;3.1.0&quot;, &quot;2.10.4&quot;, and &quot;3.0.6&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>3.2.2</p>
     */
    @NameInMap("AirflowVersion")
    public String airflowVersion;

    /**
     * <p>The specification of the Airflow instance. Valid values: <strong>SMALL</strong>, <strong>MEDIUM</strong>, <strong>LARGE</strong>, <strong>XLARGE</strong>, and <strong>X2LARGE</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMALL</p>
     */
    @NameInMap("AppSpec")
    public String appSpec;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>token-****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DAG directory scanned by Airflow.</p>
     * 
     * <strong>example:</strong>
     * <p>default/dags</p>
     */
    @NameInMap("DagsDir")
    public String dagsDir;

    /**
     * <p>The list of data mount information.</p>
     */
    @NameInMap("DataMountInfoList")
    public String dataMountInfoListShrink;

    /**
     * <p>The description of the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>order scheduler</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable Worker elasticity.</p>
     */
    @NameInMap("EnableServerless")
    public Boolean enableServerless;

    /**
     * <p>The timeout period for the Worker to gracefully shut down.</p>
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
     * <p>The OSS path for storing logs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/airflow</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    /**
     * <p>The plugin directory scanned by the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>default/plugins</p>
     */
    @NameInMap("PluginsDir")
    public String pluginsDir;

    /**
     * <p>The path of the package installation file.</p>
     * 
     * <strong>example:</strong>
     * <p>default/requirements.txt</p>
     */
    @NameInMap("RequirementFile")
    public String requirementFile;

    /**
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp108t8ldzeyk1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The startup script of the Airflow container.</p>
     * 
     * <strong>example:</strong>
     * <p>default/startup.sh</p>
     */
    @NameInMap("StartupFile")
    public String startupFile;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-8vbaf073jawozfp****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf63r6coyiw9o5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The number of extended Worker node replicas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WorkerServerlessReplicas")
    public Integer workerServerlessReplicas;

    /**
     * <p>The ID of the Data Management workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The zone ID within the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateAirflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAirflowShrinkRequest self = new CreateAirflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAirflowShrinkRequest setAirflowName(String airflowName) {
        this.airflowName = airflowName;
        return this;
    }
    public String getAirflowName() {
        return this.airflowName;
    }

    public CreateAirflowShrinkRequest setAirflowVersion(String airflowVersion) {
        this.airflowVersion = airflowVersion;
        return this;
    }
    public String getAirflowVersion() {
        return this.airflowVersion;
    }

    public CreateAirflowShrinkRequest setAppSpec(String appSpec) {
        this.appSpec = appSpec;
        return this;
    }
    public String getAppSpec() {
        return this.appSpec;
    }

    public CreateAirflowShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAirflowShrinkRequest setDagsDir(String dagsDir) {
        this.dagsDir = dagsDir;
        return this;
    }
    public String getDagsDir() {
        return this.dagsDir;
    }

    public CreateAirflowShrinkRequest setDataMountInfoListShrink(String dataMountInfoListShrink) {
        this.dataMountInfoListShrink = dataMountInfoListShrink;
        return this;
    }
    public String getDataMountInfoListShrink() {
        return this.dataMountInfoListShrink;
    }

    public CreateAirflowShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAirflowShrinkRequest setEnableServerless(Boolean enableServerless) {
        this.enableServerless = enableServerless;
        return this;
    }
    public Boolean getEnableServerless() {
        return this.enableServerless;
    }

    public CreateAirflowShrinkRequest setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
        return this;
    }
    public Integer getGracefulShutdownTimeout() {
        return this.gracefulShutdownTimeout;
    }

    public CreateAirflowShrinkRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateAirflowShrinkRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreateAirflowShrinkRequest setPluginsDir(String pluginsDir) {
        this.pluginsDir = pluginsDir;
        return this;
    }
    public String getPluginsDir() {
        return this.pluginsDir;
    }

    public CreateAirflowShrinkRequest setRequirementFile(String requirementFile) {
        this.requirementFile = requirementFile;
        return this;
    }
    public String getRequirementFile() {
        return this.requirementFile;
    }

    public CreateAirflowShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateAirflowShrinkRequest setStartupFile(String startupFile) {
        this.startupFile = startupFile;
        return this;
    }
    public String getStartupFile() {
        return this.startupFile;
    }

    public CreateAirflowShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateAirflowShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateAirflowShrinkRequest setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
        this.workerServerlessReplicas = workerServerlessReplicas;
        return this;
    }
    public Integer getWorkerServerlessReplicas() {
        return this.workerServerlessReplicas;
    }

    public CreateAirflowShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateAirflowShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
