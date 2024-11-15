// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GenericAdvancedSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenericSearchResult body;

    public static GenericAdvancedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GenericAdvancedSearchResponse self = new GenericAdvancedSearchResponse();
        return TeaModel.build(map, self);
    }

    public GenericAdvancedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenericAdvancedSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenericAdvancedSearchResponse setBody(GenericSearchResult body) {
        this.body = body;
        return this;
    }
    public GenericSearchResult getBody() {
        return this.body;
    }

}
