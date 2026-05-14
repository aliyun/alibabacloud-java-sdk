// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateAirflowShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af-test****</p>
     */
    @NameInMap("AirflowId")
    public String airflowId;

    /**
     * <strong>example:</strong>
     * <p>testairflow</p>
     */
    @NameInMap("AirflowName")
    public String airflowName;

    /**
     * <strong>example:</strong>
     * <p>SMALL</p>
     */
    @NameInMap("AppSpec")
    public String appSpec;

    /**
     * <strong>example:</strong>
     * <p>token-****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>default/dags</p>
     */
    @NameInMap("DagsDir")
    public String dagsDir;

    @NameInMap("DataMountInfoList")
    public String dataMountInfoListShrink;

    /**
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
     * <strong>example:</strong>
     * <p>default/plugins</p>
     */
    @NameInMap("PluginsDir")
    public String pluginsDir;

    /**
     * <strong>example:</strong>
     * <p>default/requirements.txt</p>
     */
    @NameInMap("RequirementFile")
    public String requirementFile;

    /**
     * <strong>example:</strong>
     * <p>default/startup.sh</p>
     */
    @NameInMap("StartupFile")
    public String startupFile;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WorkerServerlessReplicas")
    public Integer workerServerlessReplicas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>863024238280****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateAirflowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAirflowShrinkRequest self = new UpdateAirflowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAirflowShrinkRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

    public UpdateAirflowShrinkRequest setAirflowName(String airflowName) {
        this.airflowName = airflowName;
        return this;
    }
    public String getAirflowName() {
        return this.airflowName;
    }

    public UpdateAirflowShrinkRequest setAppSpec(String appSpec) {
        this.appSpec = appSpec;
        return this;
    }
    public String getAppSpec() {
        return this.appSpec;
    }

    public UpdateAirflowShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAirflowShrinkRequest setDagsDir(String dagsDir) {
        this.dagsDir = dagsDir;
        return this;
    }
    public String getDagsDir() {
        return this.dagsDir;
    }

    public UpdateAirflowShrinkRequest setDataMountInfoListShrink(String dataMountInfoListShrink) {
        this.dataMountInfoListShrink = dataMountInfoListShrink;
        return this;
    }
    public String getDataMountInfoListShrink() {
        return this.dataMountInfoListShrink;
    }

    public UpdateAirflowShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAirflowShrinkRequest setEnableServerless(Boolean enableServerless) {
        this.enableServerless = enableServerless;
        return this;
    }
    public Boolean getEnableServerless() {
        return this.enableServerless;
    }

    public UpdateAirflowShrinkRequest setGracefulShutdownTimeout(Integer gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
        return this;
    }
    public Integer getGracefulShutdownTimeout() {
        return this.gracefulShutdownTimeout;
    }

    public UpdateAirflowShrinkRequest setPluginsDir(String pluginsDir) {
        this.pluginsDir = pluginsDir;
        return this;
    }
    public String getPluginsDir() {
        return this.pluginsDir;
    }

    public UpdateAirflowShrinkRequest setRequirementFile(String requirementFile) {
        this.requirementFile = requirementFile;
        return this;
    }
    public String getRequirementFile() {
        return this.requirementFile;
    }

    public UpdateAirflowShrinkRequest setStartupFile(String startupFile) {
        this.startupFile = startupFile;
        return this;
    }
    public String getStartupFile() {
        return this.startupFile;
    }

    public UpdateAirflowShrinkRequest setWorkerServerlessReplicas(Integer workerServerlessReplicas) {
        this.workerServerlessReplicas = workerServerlessReplicas;
        return this;
    }
    public Integer getWorkerServerlessReplicas() {
        return this.workerServerlessReplicas;
    }

    public UpdateAirflowShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
