// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetRemediationTemplateResponseBody extends TeaModel {
    /**
     * <p>The information about the automatic remediation template.</p>
     */
    @NameInMap("RemediationTemplates")
    public java.util.List<GetRemediationTemplateResponseBodyRemediationTemplates> remediationTemplates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E232FC35-BD40-51E3-B2EB-09416A234939</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRemediationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRemediationTemplateResponseBody self = new GetRemediationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRemediationTemplateResponseBody setRemediationTemplates(java.util.List<GetRemediationTemplateResponseBodyRemediationTemplates> remediationTemplates) {
        this.remediationTemplates = remediationTemplates;
        return this;
    }
    public java.util.List<GetRemediationTemplateResponseBodyRemediationTemplates> getRemediationTemplates() {
        return this.remediationTemplates;
    }

    public GetRemediationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRemediationTemplateResponseBodyRemediationTemplates extends TeaModel {
        /**
         * <p>The ID of the supported rule template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-delete-protection-enabled</p>
         */
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        /**
         * <p>The type of the automatic remediation template. The value is set to OOS.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("RemediationType")
        public String remediationType;

        /**
         * <p>The parameters of the automatic remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Parameters\&quot;:{\&quot;regionId\&quot;:{\&quot;AssociationProperty\&quot;:\&quot;RegionId\&quot;,\&quot;CreateDated\&quot;:\&quot;2023-09-08T16:36:15\&quot;,\&quot;Default\&quot;:\&quot;{regionId}\&quot;,\&quot;Description\&quot;:{\&quot;en\&quot;:\&quot;regionId\&quot;,\&quot;zh-cn\&quot;:\&quot;regionId\&quot;},\&quot;Id\&quot;:538,\&quot;MaxKeyLength\&quot;:\&quot;125\&quot;,\&quot;MaxValueLength\&quot;:\&quot;255\&quot;,\&quot;ModifiedDate\&quot;:\&quot;2023-09-08T16:36:15\&quot;,\&quot;Name\&quot;:\&quot;regionId\&quot;,\&quot;Optional\&quot;:1,\&quot;TemplateIdentifier\&quot;:\&quot;ACS-ALB-BulkyEnableDeletionProtection\&quot;,\&quot;Type\&quot;:\&quot;String\&quot;,\&quot;Version\&quot;:\&quot;LASTEST\&quot;},\&quot;loadBalancerIds\&quot;:{\&quot;CreateDated\&quot;:\&quot;2023-09-08T16:36:16\&quot;,\&quot;Default\&quot;:\&quot;[\\\&quot;{resourceId}\\\&quot;]\&quot;,\&quot;Description\&quot;:{\&quot;en\&quot;:\&quot;loadBalancerIds\&quot;,\&quot;zh-cn\&quot;:\&quot;loadBalancerIds\&quot;},\&quot;Id\&quot;:539,\&quot;MaxKeyLength\&quot;:\&quot;125\&quot;,\&quot;MaxValueLength\&quot;:\&quot;255\&quot;,\&quot;ModifiedDate\&quot;:\&quot;2023-09-08T16:36:16\&quot;,\&quot;Name\&quot;:\&quot;loadBalancerIds\&quot;,\&quot;Optional\&quot;:1,\&quot;TemplateIdentifier\&quot;:\&quot;ACS-ALB-BulkyEnableDeletionProtection\&quot;,\&quot;Type\&quot;:\&quot;ARRAY\&quot;,\&quot;Version\&quot;:\&quot;LASTEST\&quot;}}}</p>
         */
        @NameInMap("TemplateDefinition")
        public String templateDefinition;

        /**
         * <p>The description of the automatic remediation template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>调用接口EnableDeletionProtection，开启ALB实例删除保护，请您知晓风险谨慎操作。</p>
         */
        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <p>The ID of the automatic remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ALB-BulkyEnableDeletionProtection</p>
         */
        @NameInMap("TemplateIdentifier")
        public String templateIdentifier;

        /**
         * <p>The name of the automatic remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>开启ALB实例删除保护</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetRemediationTemplateResponseBodyRemediationTemplates build(java.util.Map<String, ?> map) throws Exception {
            GetRemediationTemplateResponseBodyRemediationTemplates self = new GetRemediationTemplateResponseBodyRemediationTemplates();
            return TeaModel.build(map, self);
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setManagedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = managedRuleIdentifier;
            return this;
        }
        public String getManagedRuleIdentifier() {
            return this.managedRuleIdentifier;
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setTemplateDefinition(String templateDefinition) {
            this.templateDefinition = templateDefinition;
            return this;
        }
        public String getTemplateDefinition() {
            return this.templateDefinition;
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setTemplateIdentifier(String templateIdentifier) {
            this.templateIdentifier = templateIdentifier;
            return this;
        }
        public String getTemplateIdentifier() {
            return this.templateIdentifier;
        }

        public GetRemediationTemplateResponseBodyRemediationTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
