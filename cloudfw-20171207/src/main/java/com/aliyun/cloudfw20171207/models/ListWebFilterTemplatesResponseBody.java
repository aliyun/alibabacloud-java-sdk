// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterTemplatesResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of web filtering templates that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of web filtering templates.</p>
     */
    @NameInMap("WebFilterTemplates")
    public java.util.List<ListWebFilterTemplatesResponseBodyWebFilterTemplates> webFilterTemplates;

    public static ListWebFilterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterTemplatesResponseBody self = new ListWebFilterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebFilterTemplatesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListWebFilterTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWebFilterTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebFilterTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWebFilterTemplatesResponseBody setWebFilterTemplates(java.util.List<ListWebFilterTemplatesResponseBodyWebFilterTemplates> webFilterTemplates) {
        this.webFilterTemplates = webFilterTemplates;
        return this;
    }
    public java.util.List<ListWebFilterTemplatesResponseBodyWebFilterTemplates> getWebFilterTemplates() {
        return this.webFilterTemplates;
    }

    public static class ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics extends TeaModel {
        /**
         * <p>The number of web filtering rules whose action is Alert in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Alert")
        public Long alert;

        /**
         * <p>The number of web filtering rules whose action is Allow in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Allow")
        public Long allow;

        /**
         * <p>The number of web filtering rules whose action is Deny in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Deny")
        public Long deny;

        public static ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics self = new ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics();
            return TeaModel.build(map, self);
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics setAlert(Long alert) {
            this.alert = alert;
            return this;
        }
        public Long getAlert() {
            return this.alert;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics setAllow(Long allow) {
            this.allow = allow;
            return this;
        }
        public Long getAllow() {
            return this.allow;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics setDeny(Long deny) {
            this.deny = deny;
            return this;
        }
        public Long getDeny() {
            return this.deny;
        }

    }

    public static class ListWebFilterTemplatesResponseBodyWebFilterTemplates extends TeaModel {
        /**
         * <p>The creation time of the web filtering template. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731465600</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the web filtering template.</p>
         * 
         * <strong>example:</strong>
         * <p>Web filtering template for URL access control</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the web filtering template.</p>
         * 
         * <strong>example:</strong>
         * <p>Web filtering template 01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The statistics on the number of web filtering rules in the template categorized by action.</p>
         */
        @NameInMap("RuleActionStatistics")
        public ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics ruleActionStatistics;

        /**
         * <p>The status of the web filtering template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the web filtering template.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        @NameInMap("WebFilterTemplateId")
        public String webFilterTemplateId;

        public static ListWebFilterTemplatesResponseBodyWebFilterTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListWebFilterTemplatesResponseBodyWebFilterTemplates self = new ListWebFilterTemplatesResponseBodyWebFilterTemplates();
            return TeaModel.build(map, self);
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setRuleActionStatistics(ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics ruleActionStatistics) {
            this.ruleActionStatistics = ruleActionStatistics;
            return this;
        }
        public ListWebFilterTemplatesResponseBodyWebFilterTemplatesRuleActionStatistics getRuleActionStatistics() {
            return this.ruleActionStatistics;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWebFilterTemplatesResponseBodyWebFilterTemplates setWebFilterTemplateId(String webFilterTemplateId) {
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }
        public String getWebFilterTemplateId() {
            return this.webFilterTemplateId;
        }

    }

}
