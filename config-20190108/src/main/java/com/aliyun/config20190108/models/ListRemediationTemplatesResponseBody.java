// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesResponseBody extends TeaModel {
    @NameInMap("RemediationTemplates")
    public java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> remediationTemplates;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRemediationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationTemplatesResponseBody self = new ListRemediationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemediationTemplatesResponseBody setRemediationTemplates(java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> remediationTemplates) {
        this.remediationTemplates = remediationTemplates;
        return this;
    }
    public java.util.List<ListRemediationTemplatesResponseBodyRemediationTemplates> getRemediationTemplates() {
        return this.remediationTemplates;
    }

    public ListRemediationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRemediationTemplatesResponseBodyRemediationTemplates extends TeaModel {
        @NameInMap("RemediationType")
        public String remediationType;

        @NameInMap("TemplateDefinition")
        public String templateDefinition;

        @NameInMap("TemplateIdentifier")
        public String templateIdentifier;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListRemediationTemplatesResponseBodyRemediationTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListRemediationTemplatesResponseBodyRemediationTemplates self = new ListRemediationTemplatesResponseBodyRemediationTemplates();
            return TeaModel.build(map, self);
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setRemediationType(String remediationType) {
            this.remediationType = remediationType;
            return this;
        }
        public String getRemediationType() {
            return this.remediationType;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateDefinition(String templateDefinition) {
            this.templateDefinition = templateDefinition;
            return this;
        }
        public String getTemplateDefinition() {
            return this.templateDefinition;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateIdentifier(String templateIdentifier) {
            this.templateIdentifier = templateIdentifier;
            return this;
        }
        public String getTemplateIdentifier() {
            return this.templateIdentifier;
        }

        public ListRemediationTemplatesResponseBodyRemediationTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
