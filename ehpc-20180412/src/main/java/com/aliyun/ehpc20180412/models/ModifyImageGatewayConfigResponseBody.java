// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyImageGatewayConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyImageGatewayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageGatewayConfigResponseBody self = new ModifyImageGatewayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyImageGatewayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
