// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearTaskDetailListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCronClearTaskDetailListResponseBody body;

    public static GetDataCronClearTaskDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCronClearTaskDetailListResponse self = new GetDataCronClearTaskDetailListResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCronClearTaskDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCronClearTaskDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCronClearTaskDetailListResponse setBody(GetDataCronClearTaskDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCronClearTaskDetailListResponseBody getBody() {
        return this.body;
    }

}
