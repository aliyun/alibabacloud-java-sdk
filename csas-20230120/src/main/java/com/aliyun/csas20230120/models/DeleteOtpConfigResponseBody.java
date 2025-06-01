// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteOtpConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>54A4055A-343D-583E-9EAC-D12231148A68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOtpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOtpConfigResponseBody self = new DeleteOtpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOtpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
