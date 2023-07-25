// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetRemediationTemplateResponseBody extends TeaModel {
    @NameInMap("RemediationTemplates")
    public java.util.List<GetRemediationTemplateResponseBodyRemediationTemplates> remediationTemplates;

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
        @NameInMap("ManagedRuleIdentifier")
        public String managedRuleIdentifier;

        @NameInMap("RemediationType")
        public String remediationType;

        @NameInMap("TemplateDefinition")
        public String templateDefinition;

        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("TemplateIdentifier")
        public String templateIdentifier;

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
