// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeUserQuotaApplicationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UserQuotaApplications")
    public UserQuotaApplications userQuotaApplications;

    public static DescribeUserQuotaApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserQuotaApplicationsResponseBody self = new DescribeUserQuotaApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserQuotaApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserQuotaApplicationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeUserQuotaApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserQuotaApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserQuotaApplicationsResponseBody setUserQuotaApplications(UserQuotaApplications userQuotaApplications) {
        this.userQuotaApplications = userQuotaApplications;
        return this;
    }
    public UserQuotaApplications getUserQuotaApplications() {
        return this.userQuotaApplications;
    }

    public static class UserQuotaApplication extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("QuotaType")
        public String quotaType;

        @NameInMap("QuotaValue")
        public Long quotaValue;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        public static UserQuotaApplication build(java.util.Map<String, ?> map) throws Exception {
            UserQuotaApplication self = new UserQuotaApplication();
            return TeaModel.build(map, self);
        }

        public UserQuotaApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public UserQuotaApplication setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public UserQuotaApplication setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UserQuotaApplication setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public UserQuotaApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UserQuotaApplication setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public UserQuotaApplication setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UserQuotaApplication setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public UserQuotaApplication setQuotaValue(Long quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Long getQuotaValue() {
            return this.quotaValue;
        }

        public UserQuotaApplication setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public UserQuotaApplication setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UserQuotaApplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserQuotaApplication setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class UserQuotaApplications extends TeaModel {
        @NameInMap("UserQuotaApplication")
        public java.util.List<UserQuotaApplication> userQuotaApplication;

        public static UserQuotaApplications build(java.util.Map<String, ?> map) throws Exception {
            UserQuotaApplications self = new UserQuotaApplications();
            return TeaModel.build(map, self);
        }

        public UserQuotaApplications setUserQuotaApplication(java.util.List<UserQuotaApplication> userQuotaApplication) {
            this.userQuotaApplication = userQuotaApplication;
            return this;
        }
        public java.util.List<UserQuotaApplication> getUserQuotaApplication() {
            return this.userQuotaApplication;
        }

    }

}
