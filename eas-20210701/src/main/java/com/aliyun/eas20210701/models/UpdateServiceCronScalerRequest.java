// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceCronScalerRequest extends TeaModel {
    /**
     * <p>The points in time that are excluded when you schedule a CronHPA job. The points in time must be specified by using a cron expression.</p>
     */
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    /**
     * <p>The description of the CronHPA job.</p>
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
         * <p>The name of the CronHPA job.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-job-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cron expression that is used to configure the execution time of the CronHPA job. For more information about how to configure cron expressions, see <strong>Description of special characters</strong> in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 18 * * * *</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The number of instances that you want to configure for the CronHPA job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TargetSize")
        public Integer targetSize;

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

    }

}
