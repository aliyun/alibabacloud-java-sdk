// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRoleResponseBody extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
     */
    @NameInMap("InstanceJobId")
    public String instanceJobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A519F77D-28A0-52F5-AB82-5********8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkspaceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRoleResponseBody self = new UpdateWorkspaceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRoleResponseBody setInstanceJobId(String instanceJobId) {
        this.instanceJobId = instanceJobId;
        return this;
    }
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    public UpdateWorkspaceRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
