// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page_info")
    public DescribeTemplatesResponseBodyPageInfo pageInfo;

    /**
     * <p>The list of returned templates.</p>
     */
    @NameInMap("templates")
    public java.util.List<DescribeTemplatesResponseBodyTemplates> templates;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponseBody setPageInfo(DescribeTemplatesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeTemplatesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeTemplatesResponseBody setTemplates(java.util.List<DescribeTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class DescribeTemplatesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("total_count")
        public Long totalCount;

        public static DescribeTemplatesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyPageInfo self = new DescribeTemplatesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyPageInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeTemplatesResponseBodyPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeTemplatesResponseBodyPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <p>The access control policy of the template. Valid values:</p>
         * <ul>
         * <li><code>private</code>: The template is private.</li>
         * <li><code>public</code>: The template is public.</li>
         * <li><code>shared</code>: The template can be shared.</li>
         * </ul>
         * <p>Default value: <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-10T16:30:16+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>a web server</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>874ec485-e7e6-4373-8a3b-47bde8ae789f</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>webserver</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The label of the template. By default, the value is the name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>The template content in the YAML format.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1\nkind: Deployment\nmetadata:\n  name: nginx-deployment-basic\n  labels:\n    app: nginx\nspec:\n  replicas: 2\n  selector:\n    matchLabels:\n      app: nginx\n  template:\n    metadata:\n      labels:\n        app: nginx\n    spec:\n      containers:\n      - name: nginx\n        image: busybox:latest\n        ports:\n        - containerPort: 80</p>
         */
        @NameInMap("template")
        public String template;

        /**
         * <p>The type of template. This parameter can be set to a custom value.</p>
         * <ul>
         * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
         * <li>If the parameter is set to <code>compose</code>, the template is displayed on the Container Service - Swarm page in the console. However, Container Service for Swarm is deprecated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("template_type")
        public String templateType;

        /**
         * <p>The ID of the parent template. The value of <code>template_with_hist_id</code> is the same for each template version. This allows you to manage different template versions.</p>
         * 
         * <strong>example:</strong>
         * <p>ad81d115-7c8b-47e7-a222-9c28d7f6e588</p>
         */
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        /**
         * <p>The time when the template was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-10T16:30:16+08:00</p>
         */
        @NameInMap("updated")
        public String updated;

        public static DescribeTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyTemplates self = new DescribeTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyTemplates setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public DescribeTemplatesResponseBodyTemplates setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplatesResponseBodyTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplatesResponseBodyTemplates setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeTemplatesResponseBodyTemplates setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeTemplatesResponseBodyTemplates setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeTemplatesResponseBodyTemplates setTemplateWithHistId(String templateWithHistId) {
            this.templateWithHistId = templateWithHistId;
            return this;
        }
        public String getTemplateWithHistId() {
            return this.templateWithHistId;
        }

        public DescribeTemplatesResponseBodyTemplates setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
