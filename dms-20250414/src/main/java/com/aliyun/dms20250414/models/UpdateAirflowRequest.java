// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAirflowRequest extends TeaModel {
    /**
     * <p>The unique ID of the Airflow instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af-test****</p>
     */
    @NameInMap("AirflowId")
    public String airflowId;

    /**
     * <p>The name of the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testairflow</p>
     */
    @NameInMap("AirflowName")
    public String airflowName;

    /**
     * <p>The specifications of the Airflow instance.</p>
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
     * <p>The directory path where Airflow scans for DAGs.</p>
     * 
     * <strong>example:</strong>
     * <p>default/dags</p>
     */
    @NameInMap("DagsDir")
    public String dagsDir;

    @NameInMap("DataMountInfoList")
    public java.util.List<DataMountInfo> dataMountInfoList;

    /**
     * <p>The description of the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test airflow</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableServerless")
    public Boolean enableServerless;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("GracefulShutdownTimeout")
    public Integer gracefulShutdownTimeout;

    /**
     * <p>The directory path where Airflow scans for plugins.</p>
     * 
     * <strong>example:</strong>
     * <p>default/plugins</p>
     */
    @NameInMap("PluginsDir")
    public String pluginsDir;

    /**
     * <p>The path to the requirements file for package dependencies.</p>
     * 
     * <strong>example:</strong>
     * <p>default/requirements.txt</p>
     */
    @NameInMap("RequirementFile")
    public String requirementFile;

    /**
     * <p>The path to the startup script for the Airflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>default/startup.sh</p>
     */
    @NameInMap("StartupFile")
    public String startupFile;

    /**
     * <p>The number of worker nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WorkerServerlessReplicas")
    public Integer workerServerlessReplicas;

    /**
     * <p>The Data Management Service (DMS) workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>863024238280****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateAirflowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAirflowRequest self = new UpdateAirflowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAirflowRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

    public UpdateAirflowRequest setAirflowName(String airflowName) {
        this.airflowName = airflowName;
        return this;
    }
    public String getAirflowName() {
        return this.airflowName;
    }

    public UpdateAirflowRequest setAppSpec(String appSpec) {
        this.appSpec = appSpec;
        return this;
    }
    public String getAppSpec() {
        return this.appSpec;
    }

    public UpdateAirflowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAirflowRequest setDagsDir(String dagsDir) {
        this.dagsDir = dagsDir;
        return this;
    }
    public String getDagsDir() {
        return this.dagsDir;
    }

    public UpdateAirflowRequest setDataMountInfoList(java.util.List<DataMountInfo> dataMountInfoList) {
        this.dataMountInfoList = dataMountInfoList;
        return this;
    }
    public java.util.List<DataMountInfo> getDataMountInfoList() {
        return this.dataMountInfoList;
    }

    public UpdateAirflowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAirflowRequest setEnableServerless(Boolean enableServerless) {
        this.enableServerless = enableServerless;
        return this;
    }
    public Boolean getEnableServerless() {
        return this.enableServerless;
    }

    public UpdateAirflowRequest setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
        return this;
    }
    public Integer getGracefulShutdownTimeout() {
        return this.gracefulShutdownTimeout;
    }

    public UpdateAirflowRequest setPluginsDir(String pluginsDir) {
        this.pluginsDir = pluginsDir;
        return this;
    }
    public String getPluginsDir() {
        return this.pluginsDir;
    }

    public UpdateAirflowRequest setRequirementFile(String requirementFile) {
        this.requirementFile = requirementFile;
        return this;
    }
    public String getRequirementFile() {
        return this.requirementFile;
    }

    public UpdateAirflowRequest setStartupFile(String startupFile) {
        this.startupFile = startupFile;
        return this;
    }
    public String getStartupFile() {
        return this.startupFile;
    }

    public UpdateAirflowRequest setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
        this.workerServerlessReplicas = workerServerlessReplicas;
        return this;
    }
    public Integer getWorkerServerlessReplicas() {
        return this.workerServerlessReplicas;
    }

    public UpdateAirflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
