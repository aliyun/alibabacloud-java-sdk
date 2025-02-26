// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DisconnectAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E5138F7E-46B5-526A-8C99-82DEAE6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisconnectAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisconnectAndroidInstanceResponseBody self = new DisconnectAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisconnectAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
