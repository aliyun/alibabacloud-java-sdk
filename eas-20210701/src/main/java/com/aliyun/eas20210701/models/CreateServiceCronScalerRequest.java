// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerRequest extends TeaModel {
    /**
     * <p>The list of cron expressions for the dates to be excluded.</p>
     */
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    /**
     * <p>The scheduled scaling jobs.</p>
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
         * <p>The name of the scheduled scaling job.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-job-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cron expression for the scaling job. For information about how to configure a cron expression, see the <strong>Supplementary request parameter descriptions</strong> section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 18 * * * *</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The target number of instances for the scaling job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TargetSize")
        public Integer targetSize;

        /**
         * <p>The time zone configuration used to parse the execution time of the scheduled scaling job.</p>
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
