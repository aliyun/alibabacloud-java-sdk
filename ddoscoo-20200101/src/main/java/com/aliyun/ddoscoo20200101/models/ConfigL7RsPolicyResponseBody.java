// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigL7RsPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7RsPolicyResponseBody self = new ConfigL7RsPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigL7RsPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
