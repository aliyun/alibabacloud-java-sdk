// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupPermissionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityGroupPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupPermissionsResponseBody self = new DeleteSecurityGroupPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
