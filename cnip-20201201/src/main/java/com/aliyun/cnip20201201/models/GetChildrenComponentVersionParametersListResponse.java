// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetChildrenComponentVersionParametersListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetChildrenComponentVersionParametersListResponseBody body;

    public static GetChildrenComponentVersionParametersListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChildrenComponentVersionParametersListResponse self = new GetChildrenComponentVersionParametersListResponse();
        return TeaModel.build(map, self);
    }

    public GetChildrenComponentVersionParametersListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChildrenComponentVersionParametersListResponse setBody(GetChildrenComponentVersionParametersListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChildrenComponentVersionParametersListResponseBody getBody() {
        return this.body;
    }

}
