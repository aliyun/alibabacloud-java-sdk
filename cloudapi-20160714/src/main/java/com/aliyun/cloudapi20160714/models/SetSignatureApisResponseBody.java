// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetSignatureApisResponseBody extends TeaModel {
    /**
     * <p>*   This API is intended for API providers.</p>
     * <p>*   This operation allows you to bind a signature key to an API. You can bind signature keys for up to 100 APIs at a time.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSignatureApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSignatureApisResponseBody self = new SetSignatureApisResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSignatureApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
