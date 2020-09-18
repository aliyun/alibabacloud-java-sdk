// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListTemplatesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Templates")
    @Validation(required = true)
    public java.util.List<ListTemplatesResponseTemplates> templates;

    public static ListTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponse self = new ListTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTemplatesResponse setTemplates(java.util.List<ListTemplatesResponseTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListTemplatesResponseTemplates extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("TemplateName")
        @Validation(required = true)
        public String templateName;

        @NameInMap("TemplateDescription")
        @Validation(required = true)
        public String templateDescription;

        @NameInMap("TemplateTag")
        @Validation(required = true)
        public String templateTag;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("TemplateConnector")
        @Validation(required = true)
        public String templateConnector;

        @NameInMap("TemplateSummary")
        @Validation(required = true)
        public String templateSummary;

        @NameInMap("TemplateSummaryEn")
        @Validation(required = true)
        public String templateSummaryEn;

        @NameInMap("TemplateLocale")
        @Validation(required = true)
        public String templateLocale;

        @NameInMap("TemplateVersion")
        @Validation(required = true)
        public Integer templateVersion;

        @NameInMap("TemplateCreator")
        @Validation(required = true)
        public String templateCreator;

        @NameInMap("TemplateOverview")
        @Validation(required = true)
        public String templateOverview;

        public static ListTemplatesResponseTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseTemplates self = new ListTemplatesResponseTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplatesResponseTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseTemplates setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public ListTemplatesResponseTemplates setTemplateTag(String templateTag) {
            this.templateTag = templateTag;
            return this;
        }
        public String getTemplateTag() {
            return this.templateTag;
        }

        public ListTemplatesResponseTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplatesResponseTemplates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTemplatesResponseTemplates setTemplateConnector(String templateConnector) {
            this.templateConnector = templateConnector;
            return this;
        }
        public String getTemplateConnector() {
            return this.templateConnector;
        }

        public ListTemplatesResponseTemplates setTemplateSummary(String templateSummary) {
            this.templateSummary = templateSummary;
            return this;
        }
        public String getTemplateSummary() {
            return this.templateSummary;
        }

        public ListTemplatesResponseTemplates setTemplateSummaryEn(String templateSummaryEn) {
            this.templateSummaryEn = templateSummaryEn;
            return this;
        }
        public String getTemplateSummaryEn() {
            return this.templateSummaryEn;
        }

        public ListTemplatesResponseTemplates setTemplateLocale(String templateLocale) {
            this.templateLocale = templateLocale;
            return this;
        }
        public String getTemplateLocale() {
            return this.templateLocale;
        }

        public ListTemplatesResponseTemplates setTemplateVersion(Integer templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public Integer getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplatesResponseTemplates setTemplateCreator(String templateCreator) {
            this.templateCreator = templateCreator;
            return this;
        }
        public String getTemplateCreator() {
            return this.templateCreator;
        }

        public ListTemplatesResponseTemplates setTemplateOverview(String templateOverview) {
            this.templateOverview = templateOverview;
            return this;
        }
        public String getTemplateOverview() {
            return this.templateOverview;
        }

    }

}
