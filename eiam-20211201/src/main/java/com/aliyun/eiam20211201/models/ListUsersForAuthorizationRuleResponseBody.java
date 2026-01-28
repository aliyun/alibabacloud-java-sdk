// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForAuthorizationRuleResponseBody extends TeaModel {
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

    @NameInMap("Users")
    public java.util.List<ListUsersForAuthorizationRuleResponseBodyUsers> users;

    public static ListUsersForAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForAuthorizationRuleResponseBody self = new ListUsersForAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForAuthorizationRuleResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersForAuthorizationRuleResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersForAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForAuthorizationRuleResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForAuthorizationRuleResponseBody setUsers(java.util.List<ListUsersForAuthorizationRuleResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForAuthorizationRuleResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod extends TeaModel {
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

        public static ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod self = new ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod();
            return TeaModel.build(map, self);
        }

        public ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListUsersForAuthorizationRuleResponseBodyUsers extends TeaModel {
        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>账户标识。</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>有效周期。</p>
         */
        @NameInMap("ValidityPeriod")
        public ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod validityPeriod;

        /**
         * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        @NameInMap("ValidityType")
        public String validityType;

        public static ListUsersForAuthorizationRuleResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForAuthorizationRuleResponseBodyUsers self = new ListUsersForAuthorizationRuleResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForAuthorizationRuleResponseBodyUsers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersForAuthorizationRuleResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersForAuthorizationRuleResponseBodyUsers setValidityPeriod(ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod validityPeriod) {
            this.validityPeriod = validityPeriod;
            return this;
        }
        public ListUsersForAuthorizationRuleResponseBodyUsersValidityPeriod getValidityPeriod() {
            return this.validityPeriod;
        }

        public ListUsersForAuthorizationRuleResponseBodyUsers setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
