// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateEntityStoreResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>workspace-test-001</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    public static CreateEntityStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityStoreResponseBody self = new CreateEntityStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEntityStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEntityStoreResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
