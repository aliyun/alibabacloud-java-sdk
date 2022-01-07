// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateRuleActionRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Type")
    public String type;

    public static UpdateRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleActionRequest self = new UpdateRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRuleActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public UpdateRuleActionRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public UpdateRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateRuleActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
