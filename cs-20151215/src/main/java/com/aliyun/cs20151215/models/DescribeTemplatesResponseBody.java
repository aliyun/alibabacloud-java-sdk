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
         */
        @NameInMap("page_number")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("page_size")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
         * <br>
         * <p>*   `private`: The template is private.</p>
         * <p>*   `public`: The template is public.</p>
         * <p>*   `shared`: The template can be shared.</p>
         * <br>
         * <p>Default value: `private`.</p>
         */
        @NameInMap("acl")
        public String acl;

        /**
         * <p>The time when the template was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The description of the template.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The label of the template. By default, the value is the name of the template.</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>The template content in the YAML format.</p>
         */
        @NameInMap("template")
        public String template;

        /**
         * <p>The type of template. This parameter can be set to a custom value.</p>
         * <br>
         * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
         * <p>*   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. However, Container Service for Swarm is deprecated.</p>
         */
        @NameInMap("template_type")
        public String templateType;

        /**
         * <p>The ID of the parent template. The value of `template_with_hist_id` is the same for each template version. This allows you to manage different template versions.</p>
         */
        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

        /**
         * <p>The time when the template was updated.</p>
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
