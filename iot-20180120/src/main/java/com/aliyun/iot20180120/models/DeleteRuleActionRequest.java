// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteRuleActionRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

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
