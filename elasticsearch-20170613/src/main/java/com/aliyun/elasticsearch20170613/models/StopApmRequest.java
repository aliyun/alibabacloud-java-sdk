// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopApmRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static StopApmRequest build(java.util.Map<String, ?> map) throws Exception {
        StopApmRequest self = new StopApmRequest();
        return TeaModel.build(map, self);
    }

    public StopApmRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
