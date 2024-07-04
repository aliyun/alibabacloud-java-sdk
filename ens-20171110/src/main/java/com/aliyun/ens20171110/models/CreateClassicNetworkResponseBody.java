// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClassicNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the network.</p>
     * 
     * <strong>example:</strong>
     * <p>n-5s9ayrxsd9hszrlt5fgv2****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A004E06-AC1B-5806-BA5E-41AB6B02DE83</p>
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
