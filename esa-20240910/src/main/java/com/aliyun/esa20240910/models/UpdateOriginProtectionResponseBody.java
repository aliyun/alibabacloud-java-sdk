// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginProtectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C6B5E5A-42FC-5DF2-986C-4DAAE3C55086</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOriginProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginProtectionResponseBody self = new UpdateOriginProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOriginProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
