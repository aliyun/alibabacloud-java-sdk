// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public QuerySmarttagTemplateListResponseBodyTemplates templates;

    public static QuerySmarttagTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagTemplateListResponseBody self = new QuerySmarttagTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmarttagTemplateListResponseBody setTemplates(QuerySmarttagTemplateListResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public QuerySmarttagTemplateListResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public static class QuerySmarttagTemplateListResponseBodyTemplatesTemplate extends TeaModel {
        @NameInMap("AnalyseTypes")
        public String analyseTypes;

        @NameInMap("FaceCategoryIds")
        public String faceCategoryIds;

        @NameInMap("FaceCustomParamsConfig")
        public String faceCustomParamsConfig;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("KeywordConfig")
        public String keywordConfig;

        @NameInMap("KnowledgeConfig")
        public String knowledgeConfig;

        @NameInMap("LabelType")
        public String labelType;

        @NameInMap("LabelVersion")
        public String labelVersion;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static QuerySmarttagTemplateListResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagTemplateListResponseBodyTemplatesTemplate self = new QuerySmarttagTemplateListResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setAnalyseTypes(String analyseTypes) {
            this.analyseTypes = analyseTypes;
            return this;
        }
        public String getAnalyseTypes() {
            return this.analyseTypes;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setFaceCategoryIds(String faceCategoryIds) {
            this.faceCategoryIds = faceCategoryIds;
            return this;
        }
        public String getFaceCategoryIds() {
            return this.faceCategoryIds;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setFaceCustomParamsConfig(String faceCustomParamsConfig) {
            this.faceCustomParamsConfig = faceCustomParamsConfig;
            return this;
        }
        public String getFaceCustomParamsConfig() {
            return this.faceCustomParamsConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setKeywordConfig(String keywordConfig) {
            this.keywordConfig = keywordConfig;
            return this;
        }
        public String getKeywordConfig() {
            return this.keywordConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setKnowledgeConfig(String knowledgeConfig) {
            this.knowledgeConfig = knowledgeConfig;
            return this;
        }
        public String getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setLabelVersion(String labelVersion) {
            this.labelVersion = labelVersion;
            return this;
        }
        public String getLabelVersion() {
            return this.labelVersion;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QuerySmarttagTemplateListResponseBodyTemplatesTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class QuerySmarttagTemplateListResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> template;

        public static QuerySmarttagTemplateListResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            QuerySmarttagTemplateListResponseBodyTemplates self = new QuerySmarttagTemplateListResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public QuerySmarttagTemplateListResponseBodyTemplates setTemplate(java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QuerySmarttagTemplateListResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
