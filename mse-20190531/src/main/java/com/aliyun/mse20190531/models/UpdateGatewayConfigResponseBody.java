// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AF21683A-29C7-4853-AC0F-B5ADEE4D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayConfigResponseBody self = new UpdateGatewayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
