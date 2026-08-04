// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantApiKeyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantApiKeyResponseBody self = new GrantApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
