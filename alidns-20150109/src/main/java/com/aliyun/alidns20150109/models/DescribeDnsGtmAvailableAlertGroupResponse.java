// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDnsGtmAvailableAlertGroupResponse setBody(DescribeDnsGtmAvailableAlertGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmAvailableAlertGroupResponseBody getBody() {
        return this.body;
    }

}
