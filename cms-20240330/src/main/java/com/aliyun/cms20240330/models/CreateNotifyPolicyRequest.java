// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The request body, which is the complete notification policy configuration object NotifyPolicyConfig.</p>
     */
    @NameInMap("body")
    public NotifyPolicyConfig body;

    /**
     * <p>The workspace ID. This parameter is used to isolate notification policy resources across different business spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyPolicyRequest self = new CreateNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotifyPolicyRequest setBody(NotifyPolicyConfig body) {
        this.body = body;
        return this;
    }
    public NotifyPolicyConfig getBody() {
        return this.body;
    }

    public CreateNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
