// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access policy. Call <a href="https://help.aliyun.com/document_detail/2357191.html">DescribeDnsGtmAccessStrategies</a> to obtain the policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSt******</p>
     */
    @NameInMap("StrategyId")
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
