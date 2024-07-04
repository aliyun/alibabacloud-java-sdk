// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>701B3BB9-9190-544D-90D1-328B0527380C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionResponseBody self = new ModifyImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
