// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DescribeTemplateAttributeResponseBody> body;

    public static DescribeTemplateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAttributeResponse self = new DescribeTemplateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateAttributeResponse setBody(java.util.List<DescribeTemplateAttributeResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeTemplateAttributeResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeTemplateAttributeResponseBody extends TeaModel {
        /**
         * <p>编排模板ID，每次变更都会有一个模板ID。</p>
         * 
         * <strong>example:</strong>
         * <p>72d20cf8-a533-4ea9-a10d-e7630d3d****</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>编排模板的访问权限，取值：</p>
         * <ul>
         * <li><code>private</code>：私有。</li>
         * <li><code>public</code>：公共。</li>
         * <li><code>shared</code>：可共享。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>编排模板名称。</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>编排模板YAML内容。</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: V1\n***</p>
         */
        @NameInMap("template")
        public String template;

        /**
         * <p>模板类型。</p>
         * <ul>
         * <li><p>当取值为kubernetes时将在控制台的编排模板页面展示该模板。</p>
         * </li>
         * <li><p>该参数不填写或者取值为其他值时，控制台的编排模板页面将不会展示该模板。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("template_type")
        public String templateType;

        /**
         * <p>编排模板描述信息。</p>
         * 
         * <strong>example:</strong>
         * <p>test template</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>部署模板的标签。</p>
         * 
         * <strong>example:</strong>
         * <p>sa</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>编排模板唯一ID，不随模板更新而改变。</p>
         * 
         * <strong>example:</strong>
         * <p>874ec485-e7e6-4373-8a3b-47bde8ae****</p>
         */
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        /**
         * <p>编排模板创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T16:56:33+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>编排模板更新时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T16:56:33+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        public static DescribeTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateAttributeResponseBody self = new DescribeTemplateAttributeResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateAttributeResponseBody setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplateAttributeResponseBody setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public DescribeTemplateAttributeResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplateAttributeResponseBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeTemplateAttributeResponseBody setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplateAttributeResponseBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplateAttributeResponseBody setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeTemplateAttributeResponseBody setTemplateWithHistId(String templateWithHistId) {
            this.templateWithHistId = templateWithHistId;
            return this;
        }
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        public DescribeTemplateAttributeResponseBody setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeTemplateAttributeResponseBody setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
