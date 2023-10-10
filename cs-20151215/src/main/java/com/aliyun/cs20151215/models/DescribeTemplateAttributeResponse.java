// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
         * <p>The ID of the template. When you update a template, a new template ID is generated.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The access control policy of the template.</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The template content in the YAML format.</p>
         */
        @NameInMap("template")
        public String template;

        /**
         * <p>The type of template. The value can be a custom value.</p>
         * <br>
         * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
         * <p>*   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</p>
         * <p>*   If the value of the parameter is not `kubernetes`, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to `kubernetes`.</p>
         * <br>
         * <p>Default value: `kubernetes`.</p>
         */
        @NameInMap("template_type")
        public String templateType;

        /**
         * <p>The description of the template.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The label of the template.</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>The unique ID of the template. The value remains unchanged after the template is updated.</p>
         */
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        /**
         * <p>The time when the template was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The time when the template was updated.</p>
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
