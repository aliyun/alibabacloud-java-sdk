// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindSimilarFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindSimilarFacesResponseBody body;

    public static FindSimilarFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindSimilarFacesResponse self = new FindSimilarFacesResponse();
        return TeaModel.build(map, self);
    }

    public FindSimilarFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindSimilarFacesResponse setBody(FindSimilarFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindSimilarFacesResponseBody getBody() {
        return this.body;
    }

}
