// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

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
