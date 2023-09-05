// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ApplyLensServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyLensServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyLensServiceResponseBody self = new ApplyLensServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyLensServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
