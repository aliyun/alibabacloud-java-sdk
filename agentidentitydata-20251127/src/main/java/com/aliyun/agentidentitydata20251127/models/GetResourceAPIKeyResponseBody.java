// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceAPIKeyResponseBody extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceAPIKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceAPIKeyResponseBody self = new GetResourceAPIKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceAPIKeyResponseBody setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public GetResourceAPIKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
