// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UnbindDBResourceGroupWithRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindDBResourceGroupWithRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourceGroupWithRoleResponseBody self = new UnbindDBResourceGroupWithRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourceGroupWithRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
