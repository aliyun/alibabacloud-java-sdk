// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmAccessModeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    @NameInMap("AccessMode")
    @Validation(required = true)
    public String accessMode;

    public static SetGtmAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGtmAccessModeRequest self = new SetGtmAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public SetGtmAccessModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetGtmAccessModeRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public SetGtmAccessModeRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

}
