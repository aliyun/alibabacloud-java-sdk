// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceCronScalerResponseBody extends TeaModel {
    /**
     * <p>The points in time that are excluded when you schedule a CronHPA job. The points in time must be specified by using a cron expression.</p>
     */
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The CronHPA jobs.</p>
     */
    @NameInMap("ScaleJobs")
    public java.util.List<DescribeServiceCronScalerResponseBodyScaleJobs> scaleJobs;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static DescribeServiceCronScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceCronScalerResponseBody self = new DescribeServiceCronScalerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceCronScalerResponseBody setExcludeDates(java.util.List<String> excludeDates) {
        this.excludeDates = excludeDates;
        return this;
    }
    public java.util.List<String> getExcludeDates() {
        return this.excludeDates;
    }

    public DescribeServiceCronScalerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceCronScalerResponseBody setScaleJobs(java.util.List<DescribeServiceCronScalerResponseBodyScaleJobs> scaleJobs) {
        this.scaleJobs = scaleJobs;
        return this;
    }
    public java.util.List<DescribeServiceCronScalerResponseBodyScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    public DescribeServiceCronScalerResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class DescribeServiceCronScalerResponseBodyScaleJobs extends TeaModel {
        /**
         * <p>The time when the most recent CronHPA job was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-24T02:11:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the most recent CronHPA job ran. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-24T06:31:00Z</p>
         */
        @NameInMap("LastProbeTime")
        public String lastProbeTime;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cron hpa job scale-jobs-0 executed successfully. current replicas:3, desired replicas:2.&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the CronHPA job.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-job-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cron expression that is used to configure the execution time of the CronHPA job.</p>
         * 
         * <strong>example:</strong>
         * <p>0 18 * * * *</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The status of the most recent CronHPA job.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of instances that you expect to configure for the CronHPA job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TargetSize")
        public Integer targetSize;

        public static DescribeServiceCronScalerResponseBodyScaleJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceCronScalerResponseBodyScaleJobs self = new DescribeServiceCronScalerResponseBodyScaleJobs();
            return TeaModel.build(map, self);
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setLastProbeTime(String lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }
        public String getLastProbeTime() {
            return this.lastProbeTime;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceCronScalerResponseBodyScaleJobs setTargetSize(Integer targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Integer getTargetSize() {
            return this.targetSize;
        }

    }

}
