// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobConfigRequest extends TeaModel {
    /**
     * <p>The configuration content. Format:</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * </ul>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     * <ul>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * <p>{ &quot;defaultModelId&quot;: &quot;xxx&quot; &quot;defaultModelVersion&quot;:&quot;1.0.0&quot; }</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The configuration type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MultimodalIntelligentTag</li>
     * <li>MultimodalSemanticIndex</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MultimodalIntelligentTag</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>454716</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobConfigRequest self = new CreateDatasetJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDatasetJobConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CreateDatasetJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
