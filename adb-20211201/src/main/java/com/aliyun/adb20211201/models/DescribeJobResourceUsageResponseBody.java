// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeJobResourceUsageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried resource usage.</p>
     */
    @NameInMap("Data")
    public DescribeJobResourceUsageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeJobResourceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResourceUsageResponseBody self = new DescribeJobResourceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResourceUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeJobResourceUsageResponseBody setData(DescribeJobResourceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJobResourceUsageResponseBodyData getData() {
        return this.data;
    }

    public DescribeJobResourceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail extends TeaModel {
        /**
         * <p>The number of ACUs for the elastic resources.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ElasticAcuNumber")
        public Float elasticAcuNumber;

        /**
         * <p>The number of ACUs for the reserved resources.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ReservedAcuNumber")
        public Float reservedAcuNumber;

        @NameInMap("SpotAcuNumber")
        public Float spotAcuNumber;

        @NameInMap("SpotAcuPercentage")
        public Float spotAcuPercentage;

        /**
         * <p>The total number of ACUs.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TotalAcuNumber")
        public Float totalAcuNumber;

        public static DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail self = new DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail();
            return TeaModel.build(map, self);
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail setElasticAcuNumber(Float elasticAcuNumber) {
            this.elasticAcuNumber = elasticAcuNumber;
            return this;
        }
        public Float getElasticAcuNumber() {
            return this.elasticAcuNumber;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail setReservedAcuNumber(Float reservedAcuNumber) {
            this.reservedAcuNumber = reservedAcuNumber;
            return this;
        }
        public Float getReservedAcuNumber() {
            return this.reservedAcuNumber;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail setSpotAcuNumber(Float spotAcuNumber) {
            this.spotAcuNumber = spotAcuNumber;
            return this;
        }
        public Float getSpotAcuNumber() {
            return this.spotAcuNumber;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail setSpotAcuPercentage(Float spotAcuPercentage) {
            this.spotAcuPercentage = spotAcuPercentage;
            return this;
        }
        public Float getSpotAcuPercentage() {
            return this.spotAcuPercentage;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail setTotalAcuNumber(Float totalAcuNumber) {
            this.totalAcuNumber = totalAcuNumber;
            return this;
        }
        public Float getTotalAcuNumber() {
            return this.totalAcuNumber;
        }

    }

    public static class DescribeJobResourceUsageResponseBodyDataJobAcuUsage extends TeaModel {
        /**
         * <p>The ACU usage.</p>
         */
        @NameInMap("AcuUsageDetail")
        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail acuUsageDetail;

        /**
         * <p>The end time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-23T16:00:00Z</p>
         */
        @NameInMap("JobEndTime")
        public String jobEndTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1592</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The start time of the job. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-22T16:00:00Z</p>
         */
        @NameInMap("JobStartTime")
        public String jobStartTime;

        /**
         * <p>The name of the job resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>job_default</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        public static DescribeJobResourceUsageResponseBodyDataJobAcuUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResourceUsageResponseBodyDataJobAcuUsage self = new DescribeJobResourceUsageResponseBodyDataJobAcuUsage();
            return TeaModel.build(map, self);
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsage setAcuUsageDetail(DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail acuUsageDetail) {
            this.acuUsageDetail = acuUsageDetail;
            return this;
        }
        public DescribeJobResourceUsageResponseBodyDataJobAcuUsageAcuUsageDetail getAcuUsageDetail() {
            return this.acuUsageDetail;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsage setJobEndTime(String jobEndTime) {
            this.jobEndTime = jobEndTime;
            return this;
        }
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsage setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsage setJobStartTime(String jobStartTime) {
            this.jobStartTime = jobStartTime;
            return this;
        }
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        public DescribeJobResourceUsageResponseBodyDataJobAcuUsage setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

    }

    public static class DescribeJobResourceUsageResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-clusterxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-23T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The AnalyticDB compute unit (ACU) usage of the job resource group.</p>
         */
        @NameInMap("JobAcuUsage")
        public java.util.List<DescribeJobResourceUsageResponseBodyDataJobAcuUsage> jobAcuUsage;

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-22T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeJobResourceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResourceUsageResponseBodyData self = new DescribeJobResourceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJobResourceUsageResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeJobResourceUsageResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeJobResourceUsageResponseBodyData setJobAcuUsage(java.util.List<DescribeJobResourceUsageResponseBodyDataJobAcuUsage> jobAcuUsage) {
            this.jobAcuUsage = jobAcuUsage;
            return this;
        }
        public java.util.List<DescribeJobResourceUsageResponseBodyDataJobAcuUsage> getJobAcuUsage() {
            return this.jobAcuUsage;
        }

        public DescribeJobResourceUsageResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
