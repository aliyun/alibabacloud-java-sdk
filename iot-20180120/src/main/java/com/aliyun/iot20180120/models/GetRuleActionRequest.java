// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionRequest extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The rule action ID that you want to query.</p>
     * <br>
     * <p>You can query the rule action ID by using the following methods:</p>
     * <br>
     * <p>*   Call the [CreateRuleAction](~~69586~~) operation and view the **ActionId** parameter in the response.</p>
     * <p>*   Call the [ListRuleActions](~~69517~~) operation and view the **Id** parameter in the response.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionRequest self = new GetRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public GetRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
