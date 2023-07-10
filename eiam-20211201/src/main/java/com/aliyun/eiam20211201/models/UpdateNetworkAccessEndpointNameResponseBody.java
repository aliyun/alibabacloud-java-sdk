// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessEndpointNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNetworkAccessEndpointNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessEndpointNameResponseBody self = new UpdateNetworkAccessEndpointNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessEndpointNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
