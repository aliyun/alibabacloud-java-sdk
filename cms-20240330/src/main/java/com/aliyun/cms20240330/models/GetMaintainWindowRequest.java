// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMaintainWindowRequest extends TeaModel {
    /**
     * <p>The workspace name. This parameter is required by the backend and is used to isolate silence policy resources across different business spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaintainWindowRequest self = new GetMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public GetMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
