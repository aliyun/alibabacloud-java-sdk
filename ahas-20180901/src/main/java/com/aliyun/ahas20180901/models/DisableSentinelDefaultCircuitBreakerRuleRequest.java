// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelDefaultCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static DisableSentinelDefaultCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelDefaultCircuitBreakerRuleRequest self = new DisableSentinelDefaultCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableSentinelDefaultCircuitBreakerRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DisableSentinelDefaultCircuitBreakerRuleRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DisableSentinelDefaultCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
