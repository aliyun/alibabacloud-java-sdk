// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMaintainWindowRequest extends TeaModel {
    @NameInMap("body")
    public MaintainWindowForModify body;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintainWindowRequest self = new UpdateMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMaintainWindowRequest setBody(MaintainWindowForModify body) {
        this.body = body;
        return this;
    }
    public MaintainWindowForModify getBody() {
        return this.body;
    }

    public UpdateMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
