// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDataReportForServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataReportForServiceGroupResponseBody body;

    public static ListDataReportForServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataReportForServiceGroupResponse self = new ListDataReportForServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListDataReportForServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataReportForServiceGroupResponse setBody(ListDataReportForServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataReportForServiceGroupResponseBody getBody() {
        return this.body;
    }

}
