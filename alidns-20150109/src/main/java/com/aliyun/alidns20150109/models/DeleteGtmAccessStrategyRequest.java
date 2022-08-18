// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    public String strategyId;

    public static DeleteGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAccessStrategyRequest self = new DeleteGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
