// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesForGroupResponseBody extends TeaModel {
    @NameInMap("AuthorizationRules")
    public java.util.List<ListAuthorizationRulesForGroupResponseBodyAuthorizationRules> authorizationRules;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorizationRulesForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesForGroupResponseBody self = new ListAuthorizationRulesForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesForGroupResponseBody setAuthorizationRules(java.util.List<ListAuthorizationRulesForGroupResponseBodyAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<ListAuthorizationRulesForGroupResponseBodyAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public ListAuthorizationRulesForGroupResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesForGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationRulesForGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod extends TeaModel {
        /**
         * <p>授权生效结束时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>授权生效开始时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod self = new ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListAuthorizationRulesForGroupResponseBodyAuthorizationRules extends TeaModel {
        /**
         * <p>授权规则标识。</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        @NameInMap("AuthorizationRuleId")
        public String authorizationRuleId;

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>有效周期。</p>
         */
        @NameInMap("ValidityPeriod")
        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod validityPeriod;

        /**
         * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        @NameInMap("ValidityType")
        public String validityType;

        public static ListAuthorizationRulesForGroupResponseBodyAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationRulesForGroupResponseBodyAuthorizationRules self = new ListAuthorizationRulesForGroupResponseBodyAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRules setAuthorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRules setValidityPeriod(ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod validityPeriod) {
            this.validityPeriod = validityPeriod;
            return this;
        }
        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRulesValidityPeriod getValidityPeriod() {
            return this.validityPeriod;
        }

        public ListAuthorizationRulesForGroupResponseBodyAuthorizationRules setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
