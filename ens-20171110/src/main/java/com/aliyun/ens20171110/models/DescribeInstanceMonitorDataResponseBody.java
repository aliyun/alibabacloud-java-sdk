// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("MonitorData")
    public DescribeInstanceMonitorDataResponseBodyMonitorData monitorData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponseBody self = new DescribeInstanceMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMonitorDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceMonitorDataResponseBody setMonitorData(DescribeInstanceMonitorDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeInstanceMonitorDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeInstanceMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData extends TeaModel {
        @NameInMap("CPU")
        public String CPU;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Memory")
        public String memory;

        public static DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData self = new DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

    public static class DescribeInstanceMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("InstanceMonitorData")
        public java.util.List<DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData> instanceMonitorData;

        public static DescribeInstanceMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseBodyMonitorData self = new DescribeInstanceMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorData setInstanceMonitorData(java.util.List<DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData> instanceMonitorData) {
            this.instanceMonitorData = instanceMonitorData;
            return this;
        }
        public java.util.List<DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData> getInstanceMonitorData() {
            return this.instanceMonitorData;
        }

    }

}
