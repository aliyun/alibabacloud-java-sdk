// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetMaintainWindowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
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
