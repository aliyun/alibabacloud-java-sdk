// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the network access endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkAccessEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAccessEndpointResponseBody self = new CreateNetworkAccessEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAccessEndpointResponseBody setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public CreateNetworkAccessEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
