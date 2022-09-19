// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplateGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlTemplateGroupsResponseBody body;

    public static DescribeSqlTemplateGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplateGroupsResponse self = new DescribeSqlTemplateGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplateGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlTemplateGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlTemplateGroupsResponse setBody(DescribeSqlTemplateGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlTemplateGroupsResponseBody getBody() {
        return this.body;
    }

}
