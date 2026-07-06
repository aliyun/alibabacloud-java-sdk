// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateServiceCredentialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53C8FBFD-F2E9-50F2-AD63-B6566B3D4D7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceCredentialResponseBody self = new UpdateServiceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
