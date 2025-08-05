// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPrivateDnsEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6B780BD6-282C-51A9-A8E6-59F636BAFA54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPrivateDnsEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivateDnsEndpointResponseBody self = new ModifyPrivateDnsEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPrivateDnsEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
