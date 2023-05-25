// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveSignatureApisResponseBody extends TeaModel {
    /**
     * <p>Unbinds a backend signature key from APIs.</p>
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
