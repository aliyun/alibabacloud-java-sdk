// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteRuleActionRequest extends TeaModel {
    /**
     * <p>The identifier of the rule action that you want to delete.</p>
     * <br>
     * <p>After you call the [CreateRuleAction](~~69586~~) operation to create a rule action, the rule action ID is returned. You can call the [ListRuleActions](~~69517~~) operation to view the rule action ID.</p>
     */
    @NameInMap("ActionId")
    public Long actionId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleActionRequest self = new DeleteRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public DeleteRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
