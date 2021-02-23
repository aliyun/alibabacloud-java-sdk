// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTemplatesResponseBody setTemplates(java.util.List<ListTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateDescription")
        public String templateDescription;

        @NameInMap("TemplateTag")
        public String templateTag;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("TemplateConnector")
        public String templateConnector;

        @NameInMap("TemplateSummary")
        public String templateSummary;

        @NameInMap("TemplateSummaryEn")
        public String templateSummaryEn;

        @NameInMap("TemplateLocale")
        public String templateLocale;

        @NameInMap("TemplateVersion")
        public Integer templateVersion;

        @NameInMap("TemplateCreator")
        public String templateCreator;

        @NameInMap("TemplateOverview")
        public String templateOverview;

        public static ListTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplates self = new ListTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseBodyTemplates setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public ListTemplatesResponseBodyTemplates setTemplateTag(String templateTag) {
            this.templateTag = templateTag;
            return this;
        }
        public String getTemplateTag() {
            return this.templateTag;
        }

        public ListTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplatesResponseBodyTemplates setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListTemplatesResponseBodyTemplates setTemplateConnector(String templateConnector) {
            this.templateConnector = templateConnector;
            return this;
        }
        public String getTemplateConnector() {
            return this.templateConnector;
        }

        public ListTemplatesResponseBodyTemplates setTemplateSummary(String templateSummary) {
            this.templateSummary = templateSummary;
            return this;
        }
        public String getTemplateSummary() {
            return this.templateSummary;
        }

        public ListTemplatesResponseBodyTemplates setTemplateSummaryEn(String templateSummaryEn) {
            this.templateSummaryEn = templateSummaryEn;
            return this;
        }
        public String getTemplateSummaryEn() {
            return this.templateSummaryEn;
        }

        public ListTemplatesResponseBodyTemplates setTemplateLocale(String templateLocale) {
            this.templateLocale = templateLocale;
            return this;
        }
        public String getTemplateLocale() {
            return this.templateLocale;
        }

        public ListTemplatesResponseBodyTemplates setTemplateVersion(Integer templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public Integer getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTemplatesResponseBodyTemplates setTemplateCreator(String templateCreator) {
            this.templateCreator = templateCreator;
            return this;
        }
        public String getTemplateCreator() {
            return this.templateCreator;
        }

        public ListTemplatesResponseBodyTemplates setTemplateOverview(String templateOverview) {
            this.templateOverview = templateOverview;
            return this;
        }
        public String getTemplateOverview() {
            return this.templateOverview;
        }

    }

}
