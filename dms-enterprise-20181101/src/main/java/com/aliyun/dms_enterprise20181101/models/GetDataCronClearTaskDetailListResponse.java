// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCronClearTaskDetailListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDataCronClearTaskDetailListResponse setBody(GetDataCronClearTaskDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCronClearTaskDetailListResponseBody getBody() {
        return this.body;
    }

}
