// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkRuleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLiveStreamWatermarkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamWatermarkRuleRequest self = new UpdateLiveStreamWatermarkRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamWatermarkRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLiveStreamWatermarkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveStreamWatermarkRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveStreamWatermarkRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateLiveStreamWatermarkRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
