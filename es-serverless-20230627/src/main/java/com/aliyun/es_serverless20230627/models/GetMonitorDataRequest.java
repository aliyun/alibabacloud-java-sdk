// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetMonitorDataRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorDataRequest self = new GetMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorDataRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
