// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanShrinkRequest extends TeaModel {
    /**
     * <p>Additional parameters</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExternalParams")
    public String externalParamsShrink;

    /**
     * <p>Plan Template Name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PlanTemplateName")
    public String planTemplateName;

    /**
     * <p>Resource group ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzij65sf2rr5i</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>189</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

    /**
     * <p>Resource tags</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateExperimentPlanShrinkRequestTag> tag;

    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>349623</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateExperimentPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanShrinkRequest self = new CreateExperimentPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanShrinkRequest setExternalParamsShrink(String externalParamsShrink) {
        this.externalParamsShrink = externalParamsShrink;
        return this;
    }
    public String getExternalParamsShrink() {
        return this.externalParamsShrink;
    }

    public CreateExperimentPlanShrinkRequest setPlanTemplateName(String planTemplateName) {
        this.planTemplateName = planTemplateName;
        return this;
    }
    public String getPlanTemplateName() {
        return this.planTemplateName;
    }

    public CreateExperimentPlanShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExperimentPlanShrinkRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public CreateExperimentPlanShrinkRequest setTag(java.util.List<CreateExperimentPlanShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateExperimentPlanShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateExperimentPlanShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class CreateExperimentPlanShrinkRequestTag extends TeaModel {
        /**
         * <p>Key</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateExperimentPlanShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanShrinkRequestTag self = new CreateExperimentPlanShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExperimentPlanShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
