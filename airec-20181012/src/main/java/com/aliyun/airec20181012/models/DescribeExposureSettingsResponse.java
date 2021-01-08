// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeExposureSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposureSettingsResponseBody body;

    public static DescribeExposureSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposureSettingsResponse self = new DescribeExposureSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposureSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposureSettingsResponse setBody(DescribeExposureSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposureSettingsResponseBody getBody() {
        return this.body;
    }

}
