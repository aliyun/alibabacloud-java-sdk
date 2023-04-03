// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access policy.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static DescribeDnsGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyRequest self = new DescribeDnsGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
