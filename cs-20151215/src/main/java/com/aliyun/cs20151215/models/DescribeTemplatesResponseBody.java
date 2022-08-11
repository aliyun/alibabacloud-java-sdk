// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("page_info")
    public DescribeTemplatesResponseBodyPageInfo pageInfo;

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
        @NameInMap("page_number")
        public Long pageNumber;

        @NameInMap("page_size")
        public Long pageSize;

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
        @NameInMap("acl")
        public String acl;

        @NameInMap("created")
        public String created;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("tags")
        public String tags;

        @NameInMap("template")
        public String template;

        @NameInMap("template_type")
        public String templateType;

        @NameInMap("template_with_hist_id")
        public String templateWithHistId;

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
