// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListUpgradeReleaseVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUpgradeReleaseVersionsResponseBody body;

    public static ListUpgradeReleaseVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeReleaseVersionsResponse self = new ListUpgradeReleaseVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUpgradeReleaseVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpgradeReleaseVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpgradeReleaseVersionsResponse setBody(ListUpgradeReleaseVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpgradeReleaseVersionsResponseBody getBody() {
        return this.body;
    }

}
