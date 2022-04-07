// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceCronScalerResponseBody extends TeaModel {
    @NameInMap("ExcludeDates")
    public java.util.List<String> excludeDates;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleJobs")
    public java.util.List<DescribeServiceCronScalerResponseBodyScaleJobs> scaleJobs;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LastProbeTime")
        public String lastProbeTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Schedule")
        public String schedule;

        @NameInMap("State")
        public String state;

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
