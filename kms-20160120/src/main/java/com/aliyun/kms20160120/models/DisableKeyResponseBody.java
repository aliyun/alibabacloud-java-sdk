// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DisableKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2fe70ce2-3303-4fd6-b3ac-472fb2705c62</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableKeyResponseBody self = new DisableKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
