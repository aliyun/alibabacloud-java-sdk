// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RemoveApmRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static RemoveApmRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApmRequest self = new RemoveApmRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApmRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
