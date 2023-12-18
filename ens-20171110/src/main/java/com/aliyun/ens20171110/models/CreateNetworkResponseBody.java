// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the network.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkResponseBody self = new CreateNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
