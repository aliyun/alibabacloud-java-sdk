// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetEmonMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmonMonitorDataRequest self = new GetEmonMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public GetEmonMonitorDataRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
