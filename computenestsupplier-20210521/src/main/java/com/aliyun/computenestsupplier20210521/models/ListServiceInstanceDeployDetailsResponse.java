// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceDeployDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceDeployDetailsResponseBody body;

    public static ListServiceInstanceDeployDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceDeployDetailsResponse self = new ListServiceInstanceDeployDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceDeployDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceDeployDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceDeployDetailsResponse setBody(ListServiceInstanceDeployDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceDeployDetailsResponseBody getBody() {
        return this.body;
    }

}
