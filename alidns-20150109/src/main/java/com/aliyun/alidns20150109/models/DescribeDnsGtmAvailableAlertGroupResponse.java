// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmAvailableAlertGroupResponseBody body;

    public static DescribeDnsGtmAvailableAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAvailableAlertGroupResponse self = new DescribeDnsGtmAvailableAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAvailableAlertGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmAvailableAlertGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmAvailableAlertGroupResponse setBody(DescribeDnsGtmAvailableAlertGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAvailableAlertGroupResponseBody getBody() {
        return this.body;
    }

}
