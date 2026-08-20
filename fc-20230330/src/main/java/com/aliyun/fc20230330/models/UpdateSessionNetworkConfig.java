// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateSessionNetworkConfig extends TeaModel {
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    /**
     * <p>The request transform rules configured by exact target host. If omitted, existing rules are retained. An empty object clears all rules, and a non-empty object replaces all rules entirely. Null is not supported. The transform.headers and transform.headerValueReplacements fields are supported.</p>
     */
    @NameInMap("rules")
    public java.util.Map<String, java.util.List<SessionNetworkRule>> rules;

    public static UpdateSessionNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionNetworkConfig self = new UpdateSessionNetworkConfig();
        return TeaModel.build(map, self);
    }

    public UpdateSessionNetworkConfig setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public UpdateSessionNetworkConfig setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    public UpdateSessionNetworkConfig setRules(java.util.Map<String, java.util.List<SessionNetworkRule>> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.Map<String, java.util.List<SessionNetworkRule>> getRules() {
        return this.rules;
    }

}
