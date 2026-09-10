// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableMaintainWindowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static EnableMaintainWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMaintainWindowRequest self = new EnableMaintainWindowRequest();
        return TeaModel.build(map, self);
    }

    public EnableMaintainWindowRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
