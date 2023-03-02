// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClassicNetworkResponseBody extends TeaModel {
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClassicNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClassicNetworkResponseBody self = new CreateClassicNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClassicNetworkResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateClassicNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
