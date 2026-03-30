// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6AC79B74-9A78-58E2-818B-1D38EDC64D67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
