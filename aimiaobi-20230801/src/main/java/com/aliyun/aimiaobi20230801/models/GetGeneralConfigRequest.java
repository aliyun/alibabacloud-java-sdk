// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetGeneralConfigRequest extends TeaModel {
    /**
     * <p>The unique identifier of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The unique identifier of the Model Studio workspace. For more information, see <a href="">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetGeneralConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralConfigRequest self = new GetGeneralConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public GetGeneralConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
