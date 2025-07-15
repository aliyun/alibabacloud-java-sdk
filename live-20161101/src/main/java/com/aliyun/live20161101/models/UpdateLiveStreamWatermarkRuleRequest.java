// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkRuleRequest extends TeaModel {
    /**
     * <p>The description of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>my rule</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the custom rule.</p>
     * 
     * <strong>example:</strong>
     * <p>WatermarkRule****</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the watermark rule.</p>
     * <blockquote>
     * <p> You can obtain the rule ID by checking the value of the RuleId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The ID of the watermark template.</p>
     * <blockquote>
     * <p> You can obtain the template ID by checking the value of the TemplateId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848096.html">AddLiveStreamWatermark</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9 ****</p>
     */
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

    public UpdateLiveStreamWatermarkRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
