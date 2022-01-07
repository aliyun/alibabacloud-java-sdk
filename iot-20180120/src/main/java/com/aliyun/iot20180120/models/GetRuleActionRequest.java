// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

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
