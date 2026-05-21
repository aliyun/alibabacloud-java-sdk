// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableOperationEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableOperationEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableOperationEventResponseBody self = new DisableOperationEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableOperationEventResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DisableOperationEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
