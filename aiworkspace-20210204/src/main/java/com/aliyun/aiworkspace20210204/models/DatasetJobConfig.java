// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetJobConfig extends TeaModel {
    /**
     * <p>The content of the dataset job configuration, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the dataset job configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>MultimodalIntelligentTag</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The creation time of the dataset job configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-14T01:37:37Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The unique ID for the dataset job configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>dscfg-xxxxxxxxxxxx</p>
     */
    @NameInMap("DatasetJobConfigId")
    public String datasetJobConfigId;

    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The last modification time of the dataset job configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-11T02:18:54Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>234*34</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DatasetJobConfig build(java.util.Map<String, ?> map) throws Exception {
        DatasetJobConfig self = new DatasetJobConfig();
        return TeaModel.build(map, self);
    }

    public DatasetJobConfig setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DatasetJobConfig setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public DatasetJobConfig setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DatasetJobConfig setDatasetJobConfigId(String datasetJobConfigId) {
        this.datasetJobConfigId = datasetJobConfigId;
        return this;
    }
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
    }

    public DatasetJobConfig setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public DatasetJobConfig setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DatasetJobConfig setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
