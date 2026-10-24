// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class ListSystemConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The rule list.</p>
     */
    @NameInMap("List")
    public java.util.List<ListSystemConfigRulesResponseBodyList> list;

    /**
     * <p>The paging information displayed during a paged query.</p>
     */
    @NameInMap("PageInfo")
    public ListSystemConfigRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The unique identifier of the request, which is used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5B1AACF9-E87B-577A-9B12-655A2E0C96FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSystemConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigRulesResponseBody self = new ListSystemConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigRulesResponseBody setList(java.util.List<ListSystemConfigRulesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSystemConfigRulesResponseBodyList> getList() {
        return this.list;
    }

    public ListSystemConfigRulesResponseBody setPageInfo(ListSystemConfigRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListSystemConfigRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListSystemConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSystemConfigRulesResponseBodyList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>204</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The platform name of the system rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Linux.</li>
         * <li><strong>2</strong>: Windows.</li>
         * <li><strong>3</strong>: Mac.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Host defense link test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleType")
        public Integer ruleType;

        /**
         * <p>The switch status of the rule under the specified SelectionKey. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: Enabled.</li>
         * <li><strong>del</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The switch identifier of the system rule.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-ENABLE-SWITCH-TYPE_1</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static ListSystemConfigRulesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemConfigRulesResponseBodyList self = new ListSystemConfigRulesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSystemConfigRulesResponseBodyList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSystemConfigRulesResponseBodyList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListSystemConfigRulesResponseBodyList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSystemConfigRulesResponseBodyList setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ListSystemConfigRulesResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSystemConfigRulesResponseBodyList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

    public static class ListSystemConfigRulesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries to return on each page during paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSystemConfigRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSystemConfigRulesResponseBodyPageInfo self = new ListSystemConfigRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListSystemConfigRulesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSystemConfigRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSystemConfigRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSystemConfigRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
