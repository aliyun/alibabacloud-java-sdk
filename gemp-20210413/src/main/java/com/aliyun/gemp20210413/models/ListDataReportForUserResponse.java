// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataReportForUserResponseBody body;

    public static ListDataReportForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForUserResponse self = new ListDataReportForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListDataReportForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataReportForUserResponse setBody(ListDataReportForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataReportForUserResponseBody getBody() {
        return this.body;
    }

}
