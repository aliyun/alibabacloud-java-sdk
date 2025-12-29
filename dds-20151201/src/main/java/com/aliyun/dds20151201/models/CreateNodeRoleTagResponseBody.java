// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeRoleTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B0B7DE3E-xxxx-xxxx-xxxx-0B16F8834E0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNodeRoleTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeRoleTagResponseBody self = new CreateNodeRoleTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeRoleTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
