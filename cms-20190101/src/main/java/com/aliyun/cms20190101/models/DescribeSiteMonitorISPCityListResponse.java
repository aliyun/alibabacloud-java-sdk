// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSiteMonitorISPCityListResponseBody body;

    public static DescribeSiteMonitorISPCityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorISPCityListResponse self = new DescribeSiteMonitorISPCityListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorISPCityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorISPCityListResponse setBody(DescribeSiteMonitorISPCityListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorISPCityListResponseBody getBody() {
        return this.body;
    }

}
