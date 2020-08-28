// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("DefaultAddrPoolId")
    public String defaultAddrPoolId;

    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

    @NameInMap("AccessLines")
    public String accessLines;

    public static UpdateGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAccessStrategyRequest self = new UpdateGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

}
