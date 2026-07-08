// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneralConfigRequest extends TeaModel {
    /**
     * <p>The unique identifier of the configuration item. The following configurations are supported:</p>
     * <ul>
     * <li><p>Text search threshold for data sources (double): \<code>searchGenerate.searchTextMinScore\\</code></p>
     * </li>
     * <li><p>Image search threshold for data sources (double): \<code>searchGenerate.searchImageMinScore\\</code></p>
     * </li>
     * <li><p>Video search threshold for data sources (double): \<code>searchGenerate.searchVideoMinScore\\</code></p>
     * </li>
     * <li><p>Audio search threshold for data sources (double): \<code>searchGenerate.searchAudioMinScore\\</code></p>
     * </li>
     * <li><p>Plain text prompt template for answer summarization in general Q\&amp;A search (string): \<code>searchGenerate.sumQaAgentPrompt\\</code></p>
     * </li>
     * <li><p>Text and image prompt template for answer summarization in general Q\&amp;A search (string): \<code>searchGenerate.sumQaAgentVlPrompt\\</code></p>
     * </li>
     * <li><p>Plain text prompt template for answer summarization in enhanced Q\&amp;A search (string): \<code>searchGenerate.sumQaEnhanceAgentPrompt\\</code></p>
     * </li>
     * <li><p>Text and image prompt template for answer summarization in enhanced Q\&amp;A search (string): \<code>searchGenerate.sumQaEnhanceAgentVlPrompt\\</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The value of the configuration item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The unique identifier of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateGeneralConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneralConfigRequest self = new UpdateGeneralConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGeneralConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public UpdateGeneralConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public UpdateGeneralConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
