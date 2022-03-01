// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ListPackageDesignModelTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPackageDesignModelTypesResponseBody body;

    public static ListPackageDesignModelTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageDesignModelTypesResponse self = new ListPackageDesignModelTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageDesignModelTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageDesignModelTypesResponse setBody(ListPackageDesignModelTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageDesignModelTypesResponseBody getBody() {
        return this.body;
    }

}
