// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeSearchTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>787DD24A-E322-5C0D-A730-057FE62B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateList")
    public java.util.List<DescribeSearchTemplatesResponseBodyTemplateList> templateList;

    public static DescribeSearchTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchTemplatesResponseBody self = new DescribeSearchTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSearchTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSearchTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSearchTemplatesResponseBody setTemplateList(java.util.List<DescribeSearchTemplatesResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<DescribeSearchTemplatesResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class DescribeSearchTemplatesResponseBodyTemplateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Charts")
        public String charts;

        @NameInMap("Description")
        public String description;

        @NameInMap("Params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>sc-lpYrjKouRfy3MK-wteJW_Q</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>select \&quot;event.userIdentity.accountId\&quot; as account_id, count(1) as cnt group by account_id limit 1000</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <strong>example:</strong>
         * <p>tpl-wCZAFWx3Spq6CO9Ymp****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>identity.rootLogin</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <strong>example:</strong>
         * <p>audit</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeSearchTemplatesResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchTemplatesResponseBodyTemplateList self = new DescribeSearchTemplatesResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setCharts(String charts) {
            this.charts = charts;
            return this;
        }
        public String getCharts() {
            return this.charts;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public DescribeSearchTemplatesResponseBodyTemplateList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
