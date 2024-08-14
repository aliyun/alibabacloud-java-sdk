// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA06613B-37A3-549E-BAE0-E4AD8A6E93D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponseBody self = new DeletePolicyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
