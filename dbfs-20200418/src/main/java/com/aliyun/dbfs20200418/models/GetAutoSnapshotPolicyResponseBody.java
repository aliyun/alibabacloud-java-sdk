// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAutoSnapshotPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAutoSnapshotPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoSnapshotPolicyResponseBody self = new GetAutoSnapshotPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoSnapshotPolicyResponseBody setData(GetAutoSnapshotPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoSnapshotPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetAutoSnapshotPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAutoSnapshotPolicyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13523459********</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppliedDbfsNumber")
        public Integer appliedDbfsNumber;

        /**
         * <strong>example:</strong>
         * <p>1670998784000</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>1670998784000</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <strong>example:</strong>
         * <p>sp-z5siir3iq3m**********</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>PolicyTest</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepeatWeekdays")
        public java.util.List<String> repeatWeekdays;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("TimePoints")
        public java.util.List<String> timePoints;

        public static GetAutoSnapshotPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoSnapshotPolicyResponseBodyData self = new GetAutoSnapshotPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoSnapshotPolicyResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAutoSnapshotPolicyResponseBodyData setAppliedDbfsNumber(Integer appliedDbfsNumber) {
            this.appliedDbfsNumber = appliedDbfsNumber;
            return this;
        }
        public Integer getAppliedDbfsNumber() {
            return this.appliedDbfsNumber;
        }

        public GetAutoSnapshotPolicyResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetAutoSnapshotPolicyResponseBodyData setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetAutoSnapshotPolicyResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetAutoSnapshotPolicyResponseBodyData setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetAutoSnapshotPolicyResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAutoSnapshotPolicyResponseBodyData setRepeatWeekdays(java.util.List<String> repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }
        public java.util.List<String> getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        public GetAutoSnapshotPolicyResponseBodyData setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public GetAutoSnapshotPolicyResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAutoSnapshotPolicyResponseBodyData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public GetAutoSnapshotPolicyResponseBodyData setTimePoints(java.util.List<String> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<String> getTimePoints() {
            return this.timePoints;
        }

    }

}
