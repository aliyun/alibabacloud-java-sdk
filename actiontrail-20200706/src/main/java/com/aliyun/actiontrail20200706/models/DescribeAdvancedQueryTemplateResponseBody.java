// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeAdvancedQueryTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1EC1FDC7-6D01-559F-852C-30D86E9EEB3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplatePage")
    public DescribeAdvancedQueryTemplateResponseBodyTemplatePage templatePage;

    public static DescribeAdvancedQueryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedQueryTemplateResponseBody self = new DescribeAdvancedQueryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedQueryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdvancedQueryTemplateResponseBody setTemplatePage(DescribeAdvancedQueryTemplateResponseBodyTemplatePage templatePage) {
        this.templatePage = templatePage;
        return this;
    }
    public DescribeAdvancedQueryTemplateResponseBodyTemplatePage getTemplatePage() {
        return this.templatePage;
    }

    public static class DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SimpleQuery")
        public Boolean simpleQuery;

        /**
         * <strong>example:</strong>
         * <p>utpl-7OaxbyJATDaoLOgZRcV5RQ</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>event.userIdentity.type: root-account AND event.userIdentity.accessKeyId: *</p>
         */
        @NameInMap("TemplateSql")
        public String templateSql;

        public static DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList self = new DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList();
            return TeaModel.build(map, self);
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList setSimpleQuery(Boolean simpleQuery) {
            this.simpleQuery = simpleQuery;
            return this;
        }
        public Boolean getSimpleQuery() {
            return this.simpleQuery;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList setTemplateSql(String templateSql) {
            this.templateSql = templateSql;
            return this;
        }
        public String getTemplateSql() {
            return this.templateSql;
        }

    }

    public static class DescribeAdvancedQueryTemplateResponseBodyTemplatePage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TemplateList")
        public java.util.List<DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList> templateList;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeAdvancedQueryTemplateResponseBodyTemplatePage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdvancedQueryTemplateResponseBodyTemplatePage self = new DescribeAdvancedQueryTemplateResponseBodyTemplatePage();
            return TeaModel.build(map, self);
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePage setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePage setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePage setTemplateList(java.util.List<DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<DescribeAdvancedQueryTemplateResponseBodyTemplatePageTemplateList> getTemplateList() {
            return this.templateList;
        }

        public DescribeAdvancedQueryTemplateResponseBodyTemplatePage setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
