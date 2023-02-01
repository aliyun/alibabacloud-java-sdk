// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveSignatureApisResponseBody extends TeaModel {
    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSignatureApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSignatureApisResponseBody self = new RemoveSignatureApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSignatureApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
