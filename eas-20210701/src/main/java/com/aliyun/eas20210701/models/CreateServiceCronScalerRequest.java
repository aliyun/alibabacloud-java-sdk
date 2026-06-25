// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerRequest extends TeaModel {
    /**
     * <p>A list of cron expressions for dates to exclude.</p>
     */
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    /**
     * <p>The scheduled scaling tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScaleJobs")
    public java.util.List<CreateServiceCronScalerRequestScaleJobs> scaleJobs;

    public static CreateServiceCronScalerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCronScalerRequest self = new CreateServiceCronScalerRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceCronScalerRequest setExcludeDates(java.util.List<String> excludeDates) {
        this.excludeDates = excludeDates;
        return this;
    }
    public java.util.List<String> getExcludeDates() {
        return this.excludeDates;
    }

    public CreateServiceCronScalerRequest setScaleJobs(java.util.List<CreateServiceCronScalerRequestScaleJobs> scaleJobs) {
        this.scaleJobs = scaleJobs;
        return this;
    }
    public java.util.List<CreateServiceCronScalerRequestScaleJobs> getScaleJobs() {
        return this.scaleJobs;
    }

    public static class CreateServiceCronScalerRequestScaleJobs extends TeaModel {
        /**
         * <p>The name of the scheduled auto-scaling task.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-job-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cron expression that specifies when to run the scaling task. For more information about how to configure a cron expression, see the <strong>Cron expressions</strong> section.</p>
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
         * <p>1</p>
         */
        @NameInMap("TargetSize")
        public Integer targetSize;

        /**
         * <p>The time zone for the scheduled scaling task.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static CreateServiceCronScalerRequestScaleJobs build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceCronScalerRequestScaleJobs self = new CreateServiceCronScalerRequestScaleJobs();
            return TeaModel.build(map, self);
        }

        public CreateServiceCronScalerRequestScaleJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceCronScalerRequestScaleJobs setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public CreateServiceCronScalerRequestScaleJobs setTargetSize(Integer targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Integer getTargetSize() {
            return this.targetSize;
        }

        public CreateServiceCronScalerRequestScaleJobs setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
