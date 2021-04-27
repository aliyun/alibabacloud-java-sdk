// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRuleActionRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("ErrorActionFlag")
    public Boolean errorActionFlag;

    public static CreateRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleActionRequest self = new CreateRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRuleActionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRuleActionRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public CreateRuleActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateRuleActionRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateRuleActionRequest setErrorActionFlag(Boolean errorActionFlag) {
        this.errorActionFlag = errorActionFlag;
        return this;
    }
    public Boolean getErrorActionFlag() {
        return this.errorActionFlag;
    }

}
