// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SearchSgVpcGraphServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchSgVpcGraphServiceResponseBody body;

    public static SearchSgVpcGraphServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchSgVpcGraphServiceResponse self = new SearchSgVpcGraphServiceResponse();
        return TeaModel.build(map, self);
    }

    public SearchSgVpcGraphServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchSgVpcGraphServiceResponse setBody(SearchSgVpcGraphServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchSgVpcGraphServiceResponseBody getBody() {
        return this.body;
    }

}
