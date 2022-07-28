// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerRequest extends TeaModel {
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Schedule")
        public String schedule;

        @NameInMap("TargetSize")
        public Integer targetSize;

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

    }

}
