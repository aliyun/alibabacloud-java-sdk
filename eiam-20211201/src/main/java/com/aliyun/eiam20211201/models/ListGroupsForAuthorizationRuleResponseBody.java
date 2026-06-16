// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForAuthorizationRuleResponseBody extends TeaModel {
    /**
     * <p>The list of groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsForAuthorizationRuleResponseBodyGroups> groups;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is returned for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1704042061000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: milliseconds.</p>
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
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time range of the validity period. This parameter takes effect only when <strong>ValidityType</strong> is set to <strong>time_bound</strong>.</p>
         */
        @NameInMap("ValidityPeriod")
        public ListGroupsForAuthorizationRuleResponseBodyGroupsValidityPeriod validityPeriod;

        /**
         * <p>The type of the validity period of the relationship. Valid values:</p>
         * <ul>
         * <li><p>permanent: permanent</p>
         * </li>
         * <li><p>time_bound: custom time range</p>
         * </li>
         * </ul>
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
