// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class JaegerConfig extends TeaModel {
    // endpoint
    @NameInMap("endpoint")
    public String endpoint;

    public static JaegerConfig build(java.util.Map<String, ?> map) throws Exception {
        JaegerConfig self = new JaegerConfig();
        return TeaModel.build(map, self);
    }

    public JaegerConfig setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
