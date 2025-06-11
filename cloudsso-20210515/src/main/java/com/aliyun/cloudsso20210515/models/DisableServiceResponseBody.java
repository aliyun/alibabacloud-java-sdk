// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DisableServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3257EAD2-8723-1F26-B69C-F8707D8B565D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableServiceResponseBody self = new DisableServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
