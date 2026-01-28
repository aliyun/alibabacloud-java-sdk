// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<ListGroupsForAuthorizationRuleResponseBodyGroups> groups;

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

    public static ListGroupsForAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForAuthorizationRuleResponseBody self = new ListGroupsForAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForAuthorizationRuleResponseBody setGroups(java.util.List<ListGroupsForAuthorizationRuleResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForAuthorizationRuleResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForAuthorizationRuleResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupsForAuthorizationRuleResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupsForAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForAuthorizationRuleResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod extends TeaModel {
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

        public static ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod self = new ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod();
            return TeaModel.build(map, self);
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListGroupsForAuthorizationRuleResponseBodyGroups extends TeaModel {
        /**
         * <p>组标识。</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

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
        public ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod validityPeriod;

        /**
         * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        @NameInMap("ValidityType")
        public String validityType;

        public static ListGroupsForAuthorizationRuleResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForAuthorizationRuleResponseBodyGroups self = new ListGroupsForAuthorizationRuleResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroups setValidityPeriod(ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod validityPeriod) {
            this.validityPeriod = validityPeriod;
            return this;
        }
        public ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod getValidityPeriod() {
            return this.validityPeriod;
        }

        public ListGroupsForAuthorizationRuleResponseBodyGroups setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
