// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GetInstanceIdsFromTokenRequest extends TeaModel {
    // fromApp
    @NameInMap("FromApp")
    public String fromApp;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // token
    @NameInMap("Token")
    public String token;

    public static GetInstanceIdsFromTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdsFromTokenRequest self = new GetInstanceIdsFromTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdsFromTokenRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetInstanceIdsFromTokenRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceIdsFromTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
