// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class OpenKmsServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenKmsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenKmsServiceResponseBody self = new OpenKmsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenKmsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
