// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCloudMetricProfilingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCloudMetricProfilingsResponseBody body;

    public static ListCloudMetricProfilingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudMetricProfilingsResponse self = new ListCloudMetricProfilingsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudMetricProfilingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudMetricProfilingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudMetricProfilingsResponse setBody(ListCloudMetricProfilingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudMetricProfilingsResponseBody getBody() {
        return this.body;
    }

}
