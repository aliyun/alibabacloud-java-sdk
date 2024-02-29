// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EstablishRelationTableToBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EstablishRelationTableToBusinessResponseBody body;

    public static EstablishRelationTableToBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        EstablishRelationTableToBusinessResponse self = new EstablishRelationTableToBusinessResponse();
        return TeaModel.build(map, self);
    }

    public EstablishRelationTableToBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstablishRelationTableToBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EstablishRelationTableToBusinessResponse setBody(EstablishRelationTableToBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public EstablishRelationTableToBusinessResponseBody getBody() {
        return this.body;
    }

}
