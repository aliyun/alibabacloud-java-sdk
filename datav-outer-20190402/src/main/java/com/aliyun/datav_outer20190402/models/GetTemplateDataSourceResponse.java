// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetTemplateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTemplateDataSourceResponseBody body;

    public static GetTemplateDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateDataSourceResponse self = new GetTemplateDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateDataSourceResponse setBody(GetTemplateDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateDataSourceResponseBody getBody() {
        return this.body;
    }

}
