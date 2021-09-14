// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetDatasourceUserAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDatasourceUserAssociationResponseBody body;

    public static GetDatasourceUserAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceUserAssociationResponse self = new GetDatasourceUserAssociationResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasourceUserAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasourceUserAssociationResponse setBody(GetDatasourceUserAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasourceUserAssociationResponseBody getBody() {
        return this.body;
    }

}
