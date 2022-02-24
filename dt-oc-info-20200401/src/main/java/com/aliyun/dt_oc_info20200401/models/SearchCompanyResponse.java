// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class SearchCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchCompanyResponseBody body;

    public static SearchCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCompanyResponse self = new SearchCompanyResponse();
        return TeaModel.build(map, self);
    }

    public SearchCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCompanyResponse setBody(SearchCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCompanyResponseBody getBody() {
        return this.body;
    }

}
