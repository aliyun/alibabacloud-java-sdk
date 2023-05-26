// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesResponseBody extends TeaModel {
    /**
     * <p>The value of the matching condition.</p>
     */
    @NameInMap("PageBean")
    public ListSilencePoliciesResponseBodyPageBean pageBean;

    /**
     * <p>The logical operator of the matching condition. Valid values:</p>
     * <br>
     * <p>*   `eq`: equal to.</p>
     * <p>*   `neq`: not equal to.</p>
     * <p>*   `in`: contains.</p>
     * <p>*   `nin`: does not contain.</p>
     * <p>*   `re`: regular expression match.</p>
     * <p>*   `nre`: regular expression mismatch.</p>
     */
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
        /**
         * <p>The ID of the request.</p>
         */
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
        /**
         * <p>The name of the silence policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether to query the details of a silence policy. Valid values:</p>
         * <br>
         * <p>*   `true`: Details of the silence policy are queried.</p>
         * <p>*   `false`: Details of the silence policy are not queried.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules> matchingRules;

        /**
         * <p>An array of returned objects.</p>
         */
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
        /**
         * <p>The name of the silence policy.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of silence policies that were returned.</p>
         */
        @NameInMap("SilencePolicies")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePolicies> silencePolicies;

        /**
         * <p>The number of entries that were returned on each page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>An array of matching rule objects.</p>
         */
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
