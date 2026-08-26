// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteTrustedOriginResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrustedOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrustedOriginResponseBody self = new DeleteTrustedOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrustedOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
