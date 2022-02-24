// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCoreTeamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCoreTeamResponseBody body;

    public static GetCoreTeamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoreTeamResponse self = new GetCoreTeamResponse();
        return TeaModel.build(map, self);
    }

    public GetCoreTeamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCoreTeamResponse setBody(GetCoreTeamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCoreTeamResponseBody getBody() {
        return this.body;
    }

}
