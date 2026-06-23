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
     * <p>The list of templates.</p>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The maximum number of entries per page.</p>
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
         * <p>The access permissions for the deployment template. Valid values:</p>
         * <ul>
         * <li><code>private</code>: private.</li>
         * <li><code>public</code>: public.</li>
         * <li><code>shared</code>: shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The time when the orchestration template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T16:56:33+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The description of the orchestration template.</p>
         * 
         * <strong>example:</strong>
         * <p>a web server</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the orchestration template.</p>
         * 
         * <strong>example:</strong>
         * <p>874ec485-e7e6-4373-8a3b-47bde8******</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the orchestration template.</p>
         * 
         * <strong>example:</strong>
         * <p>webserver</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tag of the orchestration template. If not explicitly specified, the tag defaults to the template name.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>The template content in YAML format.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1\nkind: Deployment\nmetadata:\n  name: nginx-deployment-basic\n  labels:\n    app: nginx\nspec:\n  replicas: 2\n  selector:\n    matchLabels:\n      app: nginx\n  template:\n    metadata:\n      labels:\n        app: nginx\n    spec:\n      containers:\n      - name: nginx\n        image: busybox:latest\n        ports:\n        - containerPort: 80</p>
         */
        @NameInMap("template")
        public String template;

        /**
         * <p>The templatetype.</p>
         * <ul>
         * <li><p>If the value is set to kubernetes, the template is displayed on the Orchestration Templates page in the console.</p>
         * </li>
         * <li><p>If this parameter is left empty or set to other values, the template is not displayed on the Orchestration Templates page in the console.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("template_type")
        public String templateType;

        /**
         * <p>The ID of the parent template associated with the template. This parameter is used to implement template versioning. Different versions of the same template share the same <code>template_with_hist_id</code> value.</p>
         * 
         * <strong>example:</strong>
         * <p>ad81d115-7c8b-47e7-a222-9c28d7******</p>
         */
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        /**
         * <p>The time when the orchestration template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25T16:56:33+08:00</p>
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
