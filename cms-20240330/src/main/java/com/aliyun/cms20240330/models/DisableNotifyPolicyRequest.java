// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The workspace ID. Used to isolate notification policy resources across different business spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DisableNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableNotifyPolicyRequest self = new DisableNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DisableNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
