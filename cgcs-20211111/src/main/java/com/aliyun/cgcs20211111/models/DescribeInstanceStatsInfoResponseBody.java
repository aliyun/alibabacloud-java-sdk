// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatsInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInstanceStatsInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0977</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatsInfoResponseBody self = new DescribeInstanceStatsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatsInfoResponseBody setData(java.util.List<DescribeInstanceStatsInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceStatsInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceStatsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStatsInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>huabei</p>
         */
        @NameInMap("DistrictId")
        public String districtId;

        /**
         * <strong>example:</strong>
         * <p>gcs.r1c1m1.1xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperatingInstanceCount")
        public Integer operatingInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>6733705348307226241003</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReleasingInstanceCount")
        public Integer releasingInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReservingInstanceCount")
        public Integer reservingInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceStatsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatsInfoResponseBodyData self = new DescribeInstanceStatsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatsInfoResponseBodyData setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public DescribeInstanceStatsInfoResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceStatsInfoResponseBodyData setOperatingInstanceCount(Integer operatingInstanceCount) {
            this.operatingInstanceCount = operatingInstanceCount;
            return this;
        }
        public Integer getOperatingInstanceCount() {
            return this.operatingInstanceCount;
        }

        public DescribeInstanceStatsInfoResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeInstanceStatsInfoResponseBodyData setReleasingInstanceCount(Integer releasingInstanceCount) {
            this.releasingInstanceCount = releasingInstanceCount;
            return this;
        }
        public Integer getReleasingInstanceCount() {
            return this.releasingInstanceCount;
        }

        public DescribeInstanceStatsInfoResponseBodyData setReservingInstanceCount(Integer reservingInstanceCount) {
            this.reservingInstanceCount = reservingInstanceCount;
            return this;
        }
        public Integer getReservingInstanceCount() {
            return this.reservingInstanceCount;
        }

        public DescribeInstanceStatsInfoResponseBodyData setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public DescribeInstanceStatsInfoResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
