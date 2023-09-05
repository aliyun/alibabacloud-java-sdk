// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CancelLensServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelLensServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelLensServiceResponseBody self = new CancelLensServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelLensServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
