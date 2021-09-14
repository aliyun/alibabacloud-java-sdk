// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetDatasourceUserAssociationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDatasourceUserAssociationResponseBody body;

    public static SetDatasourceUserAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDatasourceUserAssociationResponse self = new SetDatasourceUserAssociationResponse();
        return TeaModel.build(map, self);
    }

    public SetDatasourceUserAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDatasourceUserAssociationResponse setBody(SetDatasourceUserAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDatasourceUserAssociationResponseBody getBody() {
        return this.body;
    }

}
