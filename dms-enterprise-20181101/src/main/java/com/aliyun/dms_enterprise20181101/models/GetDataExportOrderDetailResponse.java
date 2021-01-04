// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataExportOrderDetailResponseBody body;

    public static GetDataExportOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportOrderDetailResponse self = new GetDataExportOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataExportOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataExportOrderDetailResponse setBody(GetDataExportOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataExportOrderDetailResponseBody getBody() {
        return this.body;
    }

}
