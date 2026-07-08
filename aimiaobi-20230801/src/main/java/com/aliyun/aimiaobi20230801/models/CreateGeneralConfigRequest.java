// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateGeneralConfigRequest extends TeaModel {
    /**
     * <p>Unique identifier of the configuration item. Supported keys include the following:</p>
     * <ul>
     * <li><p>MiaoSou text search threshold (double): searchGenerate.searchTextMinScore</p>
     * </li>
     * <li><p>MiaoSou image search threshold (double): searchGenerate.searchImageMinScore</p>
     * </li>
     * <li><p>MiaoSou video search threshold (double): searchGenerate.searchVideoMinScore</p>
     * </li>
     * <li><p>MiaoSou audio search threshold (double): searchGenerate.searchAudioMinScore</p>
     * </li>
     * <li><p>MiaoSou Q\&amp;A search general answer summary prompt template (string): searchGenerate.sumQaAgentPrompt</p>
     * </li>
     * <li><p>MiaoSou Q\&amp;A search general answer summary prompt template with text and images (string): searchGenerate.sumQaAgentVlPrompt</p>
     * </li>
     * <li><p>MiaoSou Q\&amp;A search deep answer summary prompt template (string): searchGenerate.sumQaEnhanceAgentPrompt</p>
     * </li>
     * <li><p>MiaoSou Q\&amp;A search deep answer summary prompt template with text and images (string): searchGenerate.sumQaEnhanceAgentVlPrompt</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>Value of the configuration item</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>Unique identifier of the Model Studio workspace. <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateGeneralConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGeneralConfigRequest self = new CreateGeneralConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateGeneralConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public CreateGeneralConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public CreateGeneralConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
