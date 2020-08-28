// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("StrategyName")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("DefaultAddrPoolId")
    @Validation(required = true)
    public String defaultAddrPoolId;

    @NameInMap("FailoverAddrPoolId")
    @Validation(required = true)
    public String failoverAddrPoolId;

    @NameInMap("AccessLines")
    @Validation(required = true)
    public String accessLines;

    public static AddGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyRequest self = new AddGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

}
