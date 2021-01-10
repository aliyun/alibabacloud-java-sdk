// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowTemplateResponseBody extends TeaModel {
    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowTemplates")
    public java.util.List<ListFlowTemplateResponseBodyFlowTemplates> flowTemplates;

    public static ListFlowTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTemplateResponseBody self = new ListFlowTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowTemplateResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public ListFlowTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowTemplateResponseBody setFlowTemplates(java.util.List<ListFlowTemplateResponseBodyFlowTemplates> flowTemplates) {
        this.flowTemplates = flowTemplates;
        return this;
    }
    public java.util.List<ListFlowTemplateResponseBodyFlowTemplates> getFlowTemplates() {
        return this.flowTemplates;
    }

    public static class ListFlowTemplateResponseBodyFlowTemplates extends TeaModel {
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Locale")
        public String locale;

        @NameInMap("SummaryEn")
        public String summaryEn;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Overview")
        public String overview;

        @NameInMap("Connector")
        public String connector;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public Integer version;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static ListFlowTemplateResponseBodyFlowTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListFlowTemplateResponseBodyFlowTemplates self = new ListFlowTemplateResponseBodyFlowTemplates();
            return TeaModel.build(map, self);
        }

        public ListFlowTemplateResponseBodyFlowTemplates setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setSummaryEn(String summaryEn) {
            this.summaryEn = summaryEn;
            return this;
        }
        public String getSummaryEn() {
            return this.summaryEn;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setOverview(String overview) {
            this.overview = overview;
            return this;
        }
        public String getOverview() {
            return this.overview;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setConnector(String connector) {
            this.connector = connector;
            return this;
        }
        public String getConnector() {
            return this.connector;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowTemplateResponseBodyFlowTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
