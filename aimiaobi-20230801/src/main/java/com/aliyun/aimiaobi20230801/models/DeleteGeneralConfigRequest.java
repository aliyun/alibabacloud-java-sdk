// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteGeneralConfigRequest extends TeaModel {
    /**
     * <p>Unique identifier of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>Unique identifier of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteGeneralConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGeneralConfigRequest self = new DeleteGeneralConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGeneralConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public DeleteGeneralConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
