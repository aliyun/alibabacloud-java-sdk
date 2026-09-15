// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMaintainWindowRequest extends TeaModel {
    /**
     * <p>The request body. This parameter is required by the backend. Pass in a complete MaintainWindowForModify configuration object.</p>
     */
    @NameInMap("body")
    public MaintainWindowForModify body;

    /**
     * <p>The workspace name. This parameter is required by the backend and is used to isolate silence policy resources across different business spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaintainWindowRequest self = new CreateMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaintainWindowRequest setBody(MaintainWindowForModify body) {
        this.body = body;
        return this;
    }
    public MaintainWindowForModify getBody() {
        return this.body;
    }

    public CreateMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
