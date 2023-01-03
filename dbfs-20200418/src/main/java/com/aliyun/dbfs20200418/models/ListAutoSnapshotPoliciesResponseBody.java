// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListAutoSnapshotPoliciesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotPolicies")
    public java.util.List<ListAutoSnapshotPoliciesResponseBodySnapshotPolicies> snapshotPolicies;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAutoSnapshotPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoSnapshotPoliciesResponseBody self = new ListAutoSnapshotPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoSnapshotPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoSnapshotPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoSnapshotPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoSnapshotPoliciesResponseBody setSnapshotPolicies(java.util.List<ListAutoSnapshotPoliciesResponseBodySnapshotPolicies> snapshotPolicies) {
        this.snapshotPolicies = snapshotPolicies;
        return this;
    }
    public java.util.List<ListAutoSnapshotPoliciesResponseBodySnapshotPolicies> getSnapshotPolicies() {
        return this.snapshotPolicies;
    }

    public ListAutoSnapshotPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAutoSnapshotPoliciesResponseBodySnapshotPolicies extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppliedDbfsNumber")
        public Integer appliedDbfsNumber;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepeatWeekdays")
        public java.util.List<String> repeatWeekdays;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("TimePoints")
        public java.util.List<String> timePoints;

        public static ListAutoSnapshotPoliciesResponseBodySnapshotPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListAutoSnapshotPoliciesResponseBodySnapshotPolicies self = new ListAutoSnapshotPoliciesResponseBodySnapshotPolicies();
            return TeaModel.build(map, self);
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setAppliedDbfsNumber(Integer appliedDbfsNumber) {
            this.appliedDbfsNumber = appliedDbfsNumber;
            return this;
        }
        public Integer getAppliedDbfsNumber() {
            return this.appliedDbfsNumber;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setRepeatWeekdays(java.util.List<String> repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }
        public java.util.List<String> getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListAutoSnapshotPoliciesResponseBodySnapshotPolicies setTimePoints(java.util.List<String> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<String> getTimePoints() {
            return this.timePoints;
        }

    }

}
