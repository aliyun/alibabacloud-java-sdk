// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanRequest extends TeaModel {
    /**
     * <p>Additional parameters</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExternalParams")
    public java.util.Map<String, ?> externalParams;

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
    public java.util.List<CreateExperimentPlanRequestTag> tag;

    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>349623</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanRequest self = new CreateExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanRequest setExternalParams(java.util.Map<String, ?> externalParams) {
        this.externalParams = externalParams;
        return this;
    }
    public java.util.Map<String, ?> getExternalParams() {
        return this.externalParams;
    }

    public CreateExperimentPlanRequest setPlanTemplateName(String planTemplateName) {
        this.planTemplateName = planTemplateName;
        return this;
    }
    public String getPlanTemplateName() {
        return this.planTemplateName;
    }

    public CreateExperimentPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExperimentPlanRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public CreateExperimentPlanRequest setTag(java.util.List<CreateExperimentPlanRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateExperimentPlanRequestTag> getTag() {
        return this.tag;
    }

    public CreateExperimentPlanRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public static class CreateExperimentPlanRequestTag extends TeaModel {
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

        public static CreateExperimentPlanRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateExperimentPlanRequestTag self = new CreateExperimentPlanRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateExperimentPlanRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExperimentPlanRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
