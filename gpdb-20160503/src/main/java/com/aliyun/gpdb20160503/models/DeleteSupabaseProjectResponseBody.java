// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteSupabaseProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSupabaseProjectResponseBody self = new DeleteSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSupabaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
