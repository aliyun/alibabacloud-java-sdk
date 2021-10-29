// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAllSqlConcurrencyControlRulesRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableAllSqlConcurrencyControlRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAllSqlConcurrencyControlRulesRequest self = new DisableAllSqlConcurrencyControlRulesRequest();
        return TeaModel.build(map, self);
    }

    public DisableAllSqlConcurrencyControlRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DisableAllSqlConcurrencyControlRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
