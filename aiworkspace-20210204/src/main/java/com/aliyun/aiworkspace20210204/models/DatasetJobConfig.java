// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetJobConfig extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetJobConfigId")
    public String datasetJobConfigId;

    @NameInMap("ModifyTime")
    public String modifyTime;

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
