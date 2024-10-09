// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DisableCheckProductResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>89E3CBB7-16F3-52AE-BD32-31A43A2A807F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCheckProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckProductResponseBody self = new DisableCheckProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCheckProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
