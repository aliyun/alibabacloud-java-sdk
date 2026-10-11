// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyGatewayAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>01A05AC2-567F-5BB5-8F2D-436C4BE402E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEgressProxyGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyGatewayAttributeResponseBody self = new UpdateEgressProxyGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
