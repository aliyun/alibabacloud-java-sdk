// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAvailableAlertGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudGtmAvailableAlertGroupsResponseBody body;

    public static ListCloudGtmAvailableAlertGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAvailableAlertGroupsResponse self = new ListCloudGtmAvailableAlertGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAvailableAlertGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudGtmAvailableAlertGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudGtmAvailableAlertGroupsResponse setBody(ListCloudGtmAvailableAlertGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudGtmAvailableAlertGroupsResponseBody getBody() {
        return this.body;
    }

}
