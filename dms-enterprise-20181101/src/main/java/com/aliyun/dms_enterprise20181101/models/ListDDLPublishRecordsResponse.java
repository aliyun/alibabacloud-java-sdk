// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDDLPublishRecordsResponseBody body;

    public static ListDDLPublishRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDDLPublishRecordsResponse self = new ListDDLPublishRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListDDLPublishRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDDLPublishRecordsResponse setBody(ListDDLPublishRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDDLPublishRecordsResponseBody getBody() {
        return this.body;
    }

}
