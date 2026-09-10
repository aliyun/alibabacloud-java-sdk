// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableMaintainWindowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DisableMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableMaintainWindowRequest self = new DisableMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public DisableMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
