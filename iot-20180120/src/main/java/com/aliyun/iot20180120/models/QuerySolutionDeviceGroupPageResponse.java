// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySolutionDeviceGroupPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySolutionDeviceGroupPageResponseBody body;

    public static QuerySolutionDeviceGroupPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionDeviceGroupPageResponse self = new QuerySolutionDeviceGroupPageResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionDeviceGroupPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySolutionDeviceGroupPageResponse setBody(QuerySolutionDeviceGroupPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySolutionDeviceGroupPageResponseBody getBody() {
        return this.body;
    }

}
