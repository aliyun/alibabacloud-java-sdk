// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacesResponseBody self = new DeleteNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
