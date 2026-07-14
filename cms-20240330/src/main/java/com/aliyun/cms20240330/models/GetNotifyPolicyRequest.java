// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The unique identifier of the notification policy, returned by the create operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace ID. Used to isolate notification policy resources across different business spaces. Example: <code>default-cms-xxxx-ap-southeast-1</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyPolicyRequest self = new GetNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetNotifyPolicyRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GetNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
