// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowDraftInput extends TeaModel {
    /**
     * <p>工作流的 FDL 定义</p>
     */
    @NameInMap("definition")
    public String definition;

    /**
     * <p>工作流的描述信息</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工作流执行期间可以访问的环境变量配置，包含一组命名变量列表</p>
     */
    @NameInMap("environmentConfiguration")
    public EnvironmentConfiguration environmentConfiguration;

    /**
     * <p>工作流执行时使用的 RAM 角色 ARN</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>工作流执行历史的外部存储位置</p>
     */
    @NameInMap("externalStorageLocation")
    public String externalStorageLocation;

    public static UpdateFlowDraftInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowDraftInput self = new UpdateFlowDraftInput();
        return TeaModel.build(map, self);
    }

    public UpdateFlowDraftInput setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowDraftInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowDraftInput setEnvironmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
        this.environmentConfiguration = environmentConfiguration;
        return this;
    }
    public EnvironmentConfiguration getEnvironmentConfiguration() {
        return this.environmentConfiguration;
    }

    public UpdateFlowDraftInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateFlowDraftInput setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

}
