// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewNotifyTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;incident&quot;:{&quot;title&quot;:&quot;CPU使用率过高&quot;,&quot;severity&quot;:&quot;P1&quot;}}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>待渲染的模板列表，每项包含模板标识和模板内容</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;title&quot;,&quot;template&quot;:&quot;云监控报警: {{.incident.title}}&quot;},{&quot;key&quot;:&quot;content&quot;,&quot;template&quot;:&quot;&gt;- 级别: {{.incident.severity}}&quot;}]</p>
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
         * <p>模板标识，前端自定义，原样返回。建议使用 title / content 等语义名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Go template 语法的模板内容字符串</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>云监控报警: {{.incident.title}}</p>
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
