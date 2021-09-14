// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteDatasourceUserAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatasourceUserAssociationResponseBody body;

    public static DeleteDatasourceUserAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasourceUserAssociationResponse self = new DeleteDatasourceUserAssociationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasourceUserAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasourceUserAssociationResponse setBody(DeleteDatasourceUserAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasourceUserAssociationResponseBody getBody() {
        return this.body;
    }

}
