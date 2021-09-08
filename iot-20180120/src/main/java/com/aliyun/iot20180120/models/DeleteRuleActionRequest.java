// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteRuleActionRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ActionId")
    @Validation(required = true)
    public Long actionId;

    public static DeleteRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleActionRequest self = new DeleteRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

}
