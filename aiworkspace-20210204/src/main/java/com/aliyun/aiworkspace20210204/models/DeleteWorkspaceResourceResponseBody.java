// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static DeleteWorkspaceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResourceResponseBody self = new DeleteWorkspaceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkspaceResourceResponseBody setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
