// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class UploadIndustryDeviceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadIndustryDeviceDataResponseBody body;

    public static UploadIndustryDeviceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIndustryDeviceDataResponse self = new UploadIndustryDeviceDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadIndustryDeviceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadIndustryDeviceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadIndustryDeviceDataResponse setBody(UploadIndustryDeviceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadIndustryDeviceDataResponseBody getBody() {
        return this.body;
    }

}
