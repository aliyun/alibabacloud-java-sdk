// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteBusinessLogicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("businessLogicIdKeys")
    public java.util.List<String> businessLogicIdKeys;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeleteBusinessLogicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessLogicRequest self = new DeleteBusinessLogicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessLogicRequest setBusinessLogicIdKeys(java.util.List<String> businessLogicIdKeys) {
        this.businessLogicIdKeys = businessLogicIdKeys;
        return this;
    }
    public java.util.List<String> getBusinessLogicIdKeys() {
        return this.businessLogicIdKeys;
    }

    public DeleteBusinessLogicRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
