// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCustomPunishThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomPunishThreeResponseBody body;

    public static GetCustomPunishThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomPunishThreeResponse self = new GetCustomPunishThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomPunishThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomPunishThreeResponse setBody(GetCustomPunishThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomPunishThreeResponseBody getBody() {
        return this.body;
    }

}
