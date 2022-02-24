// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetOperateAbnormalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOperateAbnormalResponseBody body;

    public static GetOperateAbnormalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperateAbnormalResponse self = new GetOperateAbnormalResponse();
        return TeaModel.build(map, self);
    }

    public GetOperateAbnormalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperateAbnormalResponse setBody(GetOperateAbnormalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperateAbnormalResponseBody getBody() {
        return this.body;
    }

}
