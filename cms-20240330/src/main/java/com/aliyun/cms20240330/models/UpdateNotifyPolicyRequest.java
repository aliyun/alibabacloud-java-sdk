// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The request body, which contains the complete NotifyPolicyConfig configuration object for the notification policy.</p>
     */
    @NameInMap("body")
    public NotifyPolicyConfig body;

    /**
     * <p>The workspace ID, which is used to isolate notification policy resources for different business workspaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotifyPolicyRequest self = new UpdateNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNotifyPolicyRequest setBody(NotifyPolicyConfig body) {
        this.body = body;
        return this;
    }
    public NotifyPolicyConfig getBody() {
        return this.body;
    }

    public UpdateNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
