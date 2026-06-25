// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceCronScalerRequest extends TeaModel {
    /**
     * <p>The cron expressions for the dates to exclude from the schedule.</p>
     */
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    /**
     * <p>The scheduled scaling tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScaleJobs")
    public java.util.List<UpdateServiceCronScalerRequestScaleJobs> scaleJobs;

    public static UpdateServiceCronScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceCronScalerRequest self = new UpdateServiceCronScalerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceCronScalerRequest setExcludeDates(java.util.List<String> excludeDates) {
        this.excludeDates = excludeDates;
        return this;
    }
    public java.util.List<String> getExcludeDates() {
        return this.excludeDates;
    }

    public UpdateServiceCronScalerRequest setScaleJobs(java.util.List<UpdateServiceCronScalerRequestScaleJobs> scaleJobs) {
        this.scaleJobs = scaleJobs;
        return this;
    }
    public java.util.List<UpdateServiceCronScalerRequestScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    public static class UpdateServiceCronScalerRequestScaleJobs extends TeaModel {
        /**
         * <p>The name of the scheduled auto scaling task.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-job-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cron expression that specifies when to run the scaling task. For more information about cron expressions, see the <strong>Cron expressions</strong> section in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 18 * * * *</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The target number of instances for the scaling task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TargetSize")
        public Integer targetSize;

        /**
         * <p>The time zone for the cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static UpdateServiceCronScalerRequestScaleJobs build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceCronScalerRequestScaleJobs self = new UpdateServiceCronScalerRequestScaleJobs();
            return TeaModel.build(map, self);
        }

        public UpdateServiceCronScalerRequestScaleJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceCronScalerRequestScaleJobs setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public UpdateServiceCronScalerRequestScaleJobs setTargetSize(Integer targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Integer getTargetSize() {
            return this.targetSize;
        }

        public UpdateServiceCronScalerRequestScaleJobs setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
