// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesResponseBody extends TeaModel {
    /**
     * <p>The returned pages.</p>
     */
    @NameInMap("PageBean")
    public ListSilencePoliciesResponseBodyPageBean pageBean;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
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
        /**
         * <p>The key of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>altertname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The logical operator of the matching condition. Valid values:</p>
         * <ul>
         * <li><code>eq</code>: equal to</li>
         * <li><code>neq</code>: not equal to</li>
         * <li><code>in</code>: contains</li>
         * <li><code>nin</code>: does not contain</li>
         * <li><code>re</code>: regular expression match</li>
         * <li><code>nre</code>: regular expression mismatch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
         * <p>The matching conditions.</p>
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
         * <p>The effective type. Valid values: PERMANENT: The policy is effective permanently. CYCLE_EFFECT: The policy is effective cyclically. CUSTOM_TIME: The policy is effective during a custom time period.</p>
         * 
         * <strong>example:</strong>
         * <p>PERMANENT</p>
         */
        @NameInMap("EffectiveTimeType")
        public String effectiveTimeType;

        /**
         * <p>The ID of the silence policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The matching rules.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePoliciesMatchingRules> matchingRules;

        /**
         * <p>The name of the silence policy.</p>
         * 
         * <strong>example:</strong>
         * <p>silencepolicy_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the silence policy is enabled. Valid values: enable and disable.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The effective time. Valid values: WEEK: weekly DAY: daily</p>
         * 
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        @NameInMap("TimePeriod")
        public String timePeriod;

        /**
         * <p>Effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;endTime&quot;:&quot;00:00&quot;,&quot;endWeek&quot;:&quot;7&quot;,&quot;startTime&quot;:&quot;00:00&quot;,&quot;startWeek&quot;:&quot;1&quot;}]</p>
         */
        @NameInMap("TimeSlots")
        public String timeSlots;

        public static ListSilencePoliciesResponseBodyPageBeanSilencePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSilencePoliciesResponseBodyPageBeanSilencePolicies self = new ListSilencePoliciesResponseBodyPageBeanSilencePolicies();
            return TeaModel.build(map, self);
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setEffectiveTimeType(String effectiveTimeType) {
            this.effectiveTimeType = effectiveTimeType;
            return this;
        }
        public String getEffectiveTimeType() {
            return this.effectiveTimeType;
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

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setTimePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public String getTimePeriod() {
            return this.timePeriod;
        }

        public ListSilencePoliciesResponseBodyPageBeanSilencePolicies setTimeSlots(String timeSlots) {
            this.timeSlots = timeSlots;
            return this;
        }
        public String getTimeSlots() {
            return this.timeSlots;
        }

    }

    public static class ListSilencePoliciesResponseBodyPageBean extends TeaModel {
        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The queried silence policies.</p>
         */
        @NameInMap("SilencePolicies")
        public java.util.List<ListSilencePoliciesResponseBodyPageBeanSilencePolicies> silencePolicies;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The number of silence policies that were returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
