// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigNetworkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRulesResponseBody self = new ConfigNetworkRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
