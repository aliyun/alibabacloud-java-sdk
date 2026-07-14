// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static EnableNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNotifyPolicyRequest self = new EnableNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public EnableNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
