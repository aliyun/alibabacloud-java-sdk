// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetRoleStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoleStatisticsResponseBody body;

    public static GetRoleStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleStatisticsResponse self = new GetRoleStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoleStatisticsResponse setBody(GetRoleStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoleStatisticsResponseBody getBody() {
        return this.body;
    }

}
