// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceCronScalerRequest extends TeaModel {
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Schedule")
        public String schedule;

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
