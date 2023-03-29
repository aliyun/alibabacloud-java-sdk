// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class OpenCdnServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCdnServiceResponseBody self = new OpenCdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
