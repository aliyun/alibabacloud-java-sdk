// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDatasetJobConfigRequest extends TeaModel {
    /**
     * <p>The configuration content. Formats:</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * </ul>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     * <ul>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * <p>{ &quot;defaultModelId&quot;: &quot;xxx&quot; &quot;defaultModelVersion&quot;:&quot;1.0.0&quot; }</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The configuration type.</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MultimodalSemanticIndex</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>167497</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetJobConfigRequest self = new UpdateDatasetJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetJobConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDatasetJobConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateDatasetJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
