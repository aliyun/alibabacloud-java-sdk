// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static UpdateWorkspaceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResourceResponseBody self = new UpdateWorkspaceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceResourceResponseBody setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
