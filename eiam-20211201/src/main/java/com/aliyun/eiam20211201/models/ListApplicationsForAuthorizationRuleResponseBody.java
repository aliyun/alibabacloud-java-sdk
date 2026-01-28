// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForAuthorizationRuleResponseBodyApplications> applications;

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

    public static ListApplicationsForAuthorizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForAuthorizationRuleResponseBody self = new ListApplicationsForAuthorizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForAuthorizationRuleResponseBody setApplications(java.util.List<ListApplicationsForAuthorizationRuleResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsForAuthorizationRuleResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsForAuthorizationRuleResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsForAuthorizationRuleResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsForAuthorizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForAuthorizationRuleResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod extends TeaModel {
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

        public static ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod self = new ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListApplicationsForAuthorizationRuleResponseBodyApplications extends TeaModel {
        /**
         * <p>应用标识。</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

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
        public ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod validityPeriod;

        /**
         * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        @NameInMap("ValidityType")
        public String validityType;

        public static ListApplicationsForAuthorizationRuleResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForAuthorizationRuleResponseBodyApplications self = new ListApplicationsForAuthorizationRuleResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplications setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplications setValidityPeriod(ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod validityPeriod) {
            this.validityPeriod = validityPeriod;
            return this;
        }
        public ListApplicationsForAuthorizationRuleResponseBodyApplicationsValidityPeriod getValidityPeriod() {
            return this.validityPeriod;
        }

        public ListApplicationsForAuthorizationRuleResponseBodyApplications setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
