// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartApmRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static StartApmRequest build(java.util.Map<String, ?> map) throws Exception {
        StartApmRequest self = new StartApmRequest();
        return TeaModel.build(map, self);
    }

    public StartApmRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
