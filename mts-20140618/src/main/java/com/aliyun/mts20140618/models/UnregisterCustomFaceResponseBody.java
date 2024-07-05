// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnregisterCustomFaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A3347BF-7BCE-40A6-B33E-43C2B8A9A278</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnregisterCustomFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterCustomFaceResponseBody self = new UnregisterCustomFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterCustomFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
