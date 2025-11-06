// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetCommonBuyUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCommonBuyUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonBuyUrlRequest self = new GetCommonBuyUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonBuyUrlRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public GetCommonBuyUrlRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetCommonBuyUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
