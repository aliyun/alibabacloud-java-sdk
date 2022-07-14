// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchWaterMarkTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchWaterMarkTemplateResponseBody body;

    public static SearchWaterMarkTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchWaterMarkTemplateResponse self = new SearchWaterMarkTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SearchWaterMarkTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchWaterMarkTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchWaterMarkTemplateResponse setBody(SearchWaterMarkTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchWaterMarkTemplateResponseBody getBody() {
        return this.body;
    }

}
