// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMcuTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public QueryMcuTemplateResponseBodyTemplates templates;

    public static QueryMcuTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcuTemplateResponseBody self = new QueryMcuTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcuTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcuTemplateResponseBody setTemplates(QueryMcuTemplateResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public QueryMcuTemplateResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public static class QueryMcuTemplateResponseBodyTemplatesJob extends TeaModel {
        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryMcuTemplateResponseBodyTemplatesJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuTemplateResponseBodyTemplatesJob self = new QueryMcuTemplateResponseBodyTemplatesJob();
            return TeaModel.build(map, self);
        }

        public QueryMcuTemplateResponseBodyTemplatesJob setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public QueryMcuTemplateResponseBodyTemplatesJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryMcuTemplateResponseBodyTemplates extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryMcuTemplateResponseBodyTemplatesJob> job;

        public static QueryMcuTemplateResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuTemplateResponseBodyTemplates self = new QueryMcuTemplateResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public QueryMcuTemplateResponseBodyTemplates setJob(java.util.List<QueryMcuTemplateResponseBodyTemplatesJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryMcuTemplateResponseBodyTemplatesJob> getJob() {
            return this.job;
        }

    }

}
