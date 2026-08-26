// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateTrustedOriginResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrustedOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrustedOriginResponseBody self = new UpdateTrustedOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrustedOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
