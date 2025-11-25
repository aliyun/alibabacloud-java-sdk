// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DisableSdlProtectedAssetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F93A490D-9E92-5AA4-BA79-600FFC09****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableSdlProtectedAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSdlProtectedAssetResponseBody self = new DisableSdlProtectedAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSdlProtectedAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
