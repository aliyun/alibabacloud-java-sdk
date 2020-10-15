// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeInstanceMonitorDataResponseMonitorData monitorData;

    public static DescribeInstanceMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponse self = new DescribeInstanceMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMonitorDataResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceMonitorDataResponse setMonitorData(DescribeInstanceMonitorDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeInstanceMonitorDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Memory")
        @Validation(required = true)
        public String memory;

        @NameInMap("CPU")
        @Validation(required = true)
        public String CPU;

        public static DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData self = new DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

    }

    public static class DescribeInstanceMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("InstanceMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData> instanceMonitorData;

        public static DescribeInstanceMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseMonitorData self = new DescribeInstanceMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMonitorDataResponseMonitorData setInstanceMonitorData(java.util.List<DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData> instanceMonitorData) {
            this.instanceMonitorData = instanceMonitorData;
            return this;
        }
        public java.util.List<DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData> getInstanceMonitorData() {
            return this.instanceMonitorData;
        }

    }

}
