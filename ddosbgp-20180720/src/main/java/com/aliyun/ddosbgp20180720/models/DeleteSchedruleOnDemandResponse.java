// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSchedruleOnDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchedruleOnDemandResponse setBody(DeleteSchedruleOnDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedruleOnDemandResponseBody getBody() {
        return this.body;
    }

}
