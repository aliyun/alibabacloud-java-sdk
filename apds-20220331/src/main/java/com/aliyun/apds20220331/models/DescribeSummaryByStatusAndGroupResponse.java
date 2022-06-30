// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusAndGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSummaryByStatusAndGroupResponseBody body;

    public static DescribeSummaryByStatusAndGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusAndGroupResponse self = new DescribeSummaryByStatusAndGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusAndGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSummaryByStatusAndGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSummaryByStatusAndGroupResponse setBody(DescribeSummaryByStatusAndGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSummaryByStatusAndGroupResponseBody getBody() {
        return this.body;
    }

}
