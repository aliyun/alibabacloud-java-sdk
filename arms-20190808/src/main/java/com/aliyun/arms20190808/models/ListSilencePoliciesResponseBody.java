// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesResponseBody extends TeaModel {
    // 分页对象
    @NameInMap("PageBean")
    public ListSilencePoliciesResponseBodyPageBean pageBean;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListSilencePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSilencePoliciesResponseBody self = new ListSilencePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSilencePoliciesResponseBody setPageBean(ListSilencePoliciesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListSilencePoliciesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListSilencePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions extends TeaModel {
        // 条件字段
        @NameInMap("Key")
        public String key;

        // 对应关系
        @NameInMap("Operator")
        public String operator;

        // 条件字段值
        @NameInMap("Value")
        public String value;

        public static ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions build(java.util.Map<String, ?> map) throws Exception {
            ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions self = new ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions();
            return TeaModel.build(map, self);
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules extends TeaModel {
        // 匹配条件
        @NameInMap("MatchingConditions")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions> matchingConditions;

        public static ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules build(java.util.Map<String, ?> map) throws Exception {
            ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules self = new ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules();
            return TeaModel.build(map, self);
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules setMatchingConditions(java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions> matchingConditions) {
            this.matchingConditions = matchingConditions;
            return this;
        }
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRulesMatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

    }

    public static class ListSilencePoliciesResponseBodyPageBeanSilencePolicies extends TeaModel {
        // 静默策略ID
        @NameInMap("Id")
        public Long id;

        // 事件匹配规则列表
        @NameInMap("MatchingRules")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules> matchingRules;

        // 静默策略名称
        @NameInMap("Name")
        public String name;

        public static ListSilencePoliciesResponseBodyPageBeanSilencePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSilencePoliciesResponseBodyPageBeanSilencePolicies self = new ListSilencePoliciesResponseBodyPageBeanSilencePolicies();
            return TeaModel.build(map, self);
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setMatchingRules(java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules> matchingRules) {
            this.matchingRules = matchingRules;
            return this;
        }
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSilencePoliciesResponseBodyPageBean extends TeaModel {
        // 页数
        @NameInMap("Page")
        public Long page;

        // 静默策略列表
        @NameInMap("SilencePolicies")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePolicies> silencePolicies;

        // 每页数目
        @NameInMap("Size")
        public Long size;

        // 总数
        @NameInMap("Total")
        public Long total;

        public static ListSilencePoliciesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListSilencePoliciesResponseBodyPageBean self = new ListSilencePoliciesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListSilencePoliciesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListSilencePoliciesResponseBodyPageBean setSilencePolicies(java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePolicies> silencePolicies) {
            this.silencePolicies = silencePolicies;
            return this;
        }
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePolicies> getSilencePolicies() {
            return this.silencePolicies;
        }

        public ListSilencePoliciesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListSilencePoliciesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
