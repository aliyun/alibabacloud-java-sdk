// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTemplateAttributeResponseBody body;

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

    public DescribeTemplateAttributeResponse setBody(DescribeTemplateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateAttributeResponseBody getBody() {
        return this.body;
    }

    public static class DescribeTemplateAttributeResponseBodyTemplateInfo extends TeaModel {
        // 编排模板ID，模板每次修改，这个ID都会改变。	
        @NameInMap("id")
        public String id;

        // 编排模板权限。取值：private，public，shared。
        @NameInMap("acl")
        public String acl;

        // 编排模板名称。	
        @NameInMap("name")
        public String name;

        // 编排模板内容。	
        @NameInMap("template")
        public String template;

        // 编排模板类型
        @NameInMap("template_type")
        public String templateType;

        // 编排模板描述。
        @NameInMap("description")
        public String description;

        // 部署模板的标签。
        @NameInMap("tags")
        public String tags;

        // 编排模板ID，该ID唯一不随更新而改变。	
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        // 编排模板创建时间。
        @NameInMap("created")
        public String created;

        // 编排模板修改时间。	
        @NameInMap("updated")
        public String updated;

        public static DescribeTemplateAttributeResponseBodyTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateAttributeResponseBodyTemplateInfo self = new DescribeTemplateAttributeResponseBodyTemplateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setTemplateWithHistId(String templateWithHistId) {
            this.templateWithHistId = templateWithHistId;
            return this;
        }
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeTemplateAttributeResponseBodyTemplateInfo setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeTemplateAttributeResponseBody extends TeaModel {
        @NameInMap("template_info")
        public java.util.List<DescribeTemplateAttributeResponseBodyTemplateInfo> templateInfo;

        public static DescribeTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateAttributeResponseBody self = new DescribeTemplateAttributeResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateAttributeResponseBody setTemplateInfo(java.util.List<DescribeTemplateAttributeResponseBodyTemplateInfo> templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public java.util.List<DescribeTemplateAttributeResponseBodyTemplateInfo> getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
