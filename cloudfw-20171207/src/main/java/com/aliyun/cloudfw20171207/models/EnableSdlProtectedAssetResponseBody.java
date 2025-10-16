// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class EnableSdlProtectedAssetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableSdlProtectedAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSdlProtectedAssetResponseBody self = new EnableSdlProtectedAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSdlProtectedAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
