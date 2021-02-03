// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    public static DeleteDnsGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAccessStrategyRequest self = new DeleteDnsGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDnsGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
