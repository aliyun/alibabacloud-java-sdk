// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteUserPermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D676EFC-8C04-5CCE-A08E-BB97D24B47E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserPermissionResponseBody self = new DeleteUserPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
