// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonGrafanaAlertsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetEmonGrafanaAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmonGrafanaAlertsRequest self = new GetEmonGrafanaAlertsRequest();
        return TeaModel.build(map, self);
    }

    public GetEmonGrafanaAlertsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
