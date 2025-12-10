// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNetworkAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkAttributeResponseBody self = new ModifyInstanceNetworkAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
