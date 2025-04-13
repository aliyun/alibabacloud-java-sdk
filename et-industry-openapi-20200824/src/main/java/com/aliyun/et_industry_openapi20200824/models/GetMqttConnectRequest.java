// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class GetMqttConnectRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    public static GetMqttConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqttConnectRequest self = new GetMqttConnectRequest();
        return TeaModel.build(map, self);
    }

    public GetMqttConnectRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

}
