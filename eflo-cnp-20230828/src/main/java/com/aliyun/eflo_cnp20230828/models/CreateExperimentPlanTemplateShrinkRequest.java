// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Privacy Level</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("PrivacyLevel")
    public String privacyLevel;

    /**
     * <p>Template Description</p>
     * 
     * <strong>example:</strong>
     * <p>The template installs jdk and tomcat on a new ECS instance.</p>
     */
    @NameInMap("TemplateDescription")
    public String templateDescription;

    /**
     * <p>Template ID</p>
     * 
     * <strong>example:</strong>
     * <p>4724</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>Template Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>Template Pipeline</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplatePipeline")
    public String templatePipelineShrink;

    public static CreateExperimentPlanTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanTemplateShrinkRequest self = new CreateExperimentPlanTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanTemplateShrinkRequest setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
        return this;
    }
    public String getPrivacyLevel() {
        return this.privacyLevel;
    }

    public CreateExperimentPlanTemplateShrinkRequest setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public CreateExperimentPlanTemplateShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateExperimentPlanTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateExperimentPlanTemplateShrinkRequest setTemplatePipelineShrink(String templatePipelineShrink) {
        this.templatePipelineShrink = templatePipelineShrink;
        return this;
    }
    public String getTemplatePipelineShrink() {
        return this.templatePipelineShrink;
    }

}
