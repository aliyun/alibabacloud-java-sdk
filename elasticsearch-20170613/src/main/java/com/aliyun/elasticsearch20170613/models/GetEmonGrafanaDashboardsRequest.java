// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonGrafanaDashboardsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetEmonGrafanaDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmonGrafanaDashboardsRequest self = new GetEmonGrafanaDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public GetEmonGrafanaDashboardsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
