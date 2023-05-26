// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectOcrCompareFacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IdDetectOcrCompareFacesResponseBody body;

    public static IdDetectOcrCompareFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        IdDetectOcrCompareFacesResponse self = new IdDetectOcrCompareFacesResponse();
        return TeaModel.build(map, self);
    }

    public IdDetectOcrCompareFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdDetectOcrCompareFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IdDetectOcrCompareFacesResponse setBody(IdDetectOcrCompareFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public IdDetectOcrCompareFacesResponseBody getBody() {
        return this.body;
    }

}
