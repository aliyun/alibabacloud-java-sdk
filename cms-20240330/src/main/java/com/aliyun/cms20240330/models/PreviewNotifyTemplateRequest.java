// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewNotifyTemplateRequest extends TeaModel {
    /**
     * <p>The rendering context data in key-value pair format. This data source is used to populate Go template placeholders in the templates, such as {{.incident.title}}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;incident&quot;:{&quot;title&quot;:&quot;High CPU utilization&quot;,&quot;severity&quot;:&quot;P1&quot;}}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The list of templates to be rendered. Each item includes a template identifier and the template content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;title&quot;,&quot;template&quot;:&quot;CloudMonitor alert: {{.incident.title}}&quot;},{&quot;key&quot;:&quot;content&quot;,&quot;template&quot;:&quot;&gt;- Severity: {{.incident.severity}}&quot;}]</p>
     */
    @NameInMap("templates")
    public java.util.List<PreviewNotifyTemplateRequestTemplates> templates;

    public static PreviewNotifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewNotifyTemplateRequest self = new PreviewNotifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PreviewNotifyTemplateRequest setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public PreviewNotifyTemplateRequest setTemplates(java.util.List<PreviewNotifyTemplateRequestTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<PreviewNotifyTemplateRequestTemplates> getTemplates() {
        return this.templates;
    }

    public static class PreviewNotifyTemplateRequestTemplates extends TeaModel {
        /**
         * <p>The template identifier. This identifier is defined by the frontend and returned as-is. Use semantic names such as title or content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The template content string in Go template syntax.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor alert: {{.incident.title}}</p>
         */
        @NameInMap("template")
        public String template;

        public static PreviewNotifyTemplateRequestTemplates build(java.util.Map<String, ?> map) throws Exception {
            PreviewNotifyTemplateRequestTemplates self = new PreviewNotifyTemplateRequestTemplates();
            return TeaModel.build(map, self);
        }

        public PreviewNotifyTemplateRequestTemplates setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PreviewNotifyTemplateRequestTemplates setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
