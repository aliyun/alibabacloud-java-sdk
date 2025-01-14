// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteApprovalProcessesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApprovalProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApprovalProcessesResponseBody self = new DeleteApprovalProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApprovalProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
