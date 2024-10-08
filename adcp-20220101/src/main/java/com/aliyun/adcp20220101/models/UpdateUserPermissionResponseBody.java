// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateUserPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>62F5AA2B-A2C9-5135-BCE2-C2167099****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPermissionResponseBody self = new UpdateUserPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
