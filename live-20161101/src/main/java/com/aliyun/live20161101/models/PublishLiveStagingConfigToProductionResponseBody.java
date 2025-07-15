// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class PublishLiveStagingConfigToProductionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishLiveStagingConfigToProductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveStagingConfigToProductionResponseBody self = new PublishLiveStagingConfigToProductionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishLiveStagingConfigToProductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
