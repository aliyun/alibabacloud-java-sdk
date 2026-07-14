// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The unique identifier of the notification policy, returned by the creation operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np-12345678-1234-1234-1234-123456789012</p>
     */
    @NameInMap("uuid")
    public String uuid;

    /**
     * <p>The workspace ID. Used to isolate notification policy resources across different business spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-xxxx-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DeleteNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotifyPolicyRequest self = new DeleteNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNotifyPolicyRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DeleteNotifyPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
