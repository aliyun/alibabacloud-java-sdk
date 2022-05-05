// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public Boolean state;

    public static GetIntegrationStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationStateResponseBody self = new GetIntegrationStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIntegrationStateResponseBody setState(Boolean state) {
        this.state = state;
        return this;
    }
    public Boolean getState() {
        return this.state;
    }

}
