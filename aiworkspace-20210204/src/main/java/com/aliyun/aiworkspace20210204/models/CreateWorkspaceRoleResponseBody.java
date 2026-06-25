// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRoleResponseBody extends TeaModel {
    /**
     * <p>The job ID for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
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

    public static CreateWorkspaceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRoleResponseBody self = new CreateWorkspaceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRoleResponseBody setInstanceJobId(String instanceJobId) {
        this.instanceJobId = instanceJobId;
        return this;
    }
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    public CreateWorkspaceRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
