// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class OpenCc5gServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2DCFA69E-A161-512D-99A7-108022580719</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCc5gServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCc5gServiceResponseBody self = new OpenCc5gServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCc5gServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
