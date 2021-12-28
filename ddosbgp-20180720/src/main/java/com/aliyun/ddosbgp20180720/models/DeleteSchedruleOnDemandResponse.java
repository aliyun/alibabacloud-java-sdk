// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSchedruleOnDemandResponseBody body;

    public static DeleteSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedruleOnDemandResponse self = new DeleteSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedruleOnDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchedruleOnDemandResponse setBody(DeleteSchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
