// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SessionNetworkRule extends TeaModel {
    @NameInMap("transform")
    public SessionNetworkRuleTransform transform;

    public static SessionNetworkRule build(java.util.Map<String, ?> map) throws Exception {
        SessionNetworkRule self = new SessionNetworkRule();
        return TeaModel.build(map, self);
    }

    public SessionNetworkRule setTransform(SessionNetworkRuleTransform transform) {
        this.transform = transform;
        return this;
    }
    public SessionNetworkRuleTransform getTransform() {
        return this.transform;
    }

}
