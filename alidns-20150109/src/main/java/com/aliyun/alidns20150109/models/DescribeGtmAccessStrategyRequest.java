// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access policy that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static DescribeGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyRequest self = new DescribeGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
