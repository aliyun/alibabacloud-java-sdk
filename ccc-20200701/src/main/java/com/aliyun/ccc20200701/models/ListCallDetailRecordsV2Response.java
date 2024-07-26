// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallDetailRecordsV2ResponseBody body;

    public static ListCallDetailRecordsV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsV2Response self = new ListCallDetailRecordsV2Response();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallDetailRecordsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallDetailRecordsV2Response setBody(ListCallDetailRecordsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallDetailRecordsV2ResponseBody getBody() {
        return this.body;
    }

}
