// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelDefaulCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static EnableSentinelDefaulCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelDefaulCircuitBreakerRuleRequest self = new EnableSentinelDefaulCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableSentinelDefaulCircuitBreakerRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public EnableSentinelDefaulCircuitBreakerRuleRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public EnableSentinelDefaulCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
