// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AlertStrategyRelation extends TeaModel {
    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("StrategyUuid")
    public String strategyUuid;

    public static AlertStrategyRelation build(java.util.Map<String, ?> map) throws Exception {
        AlertStrategyRelation self = new AlertStrategyRelation();
        return TeaModel.build(map, self);
    }

    public AlertStrategyRelation setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public AlertStrategyRelation setStrategyUuid(String strategyUuid) {
        this.strategyUuid = strategyUuid;
        return this;
    }
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

}
