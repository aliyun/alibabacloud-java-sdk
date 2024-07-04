// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The set of InstanceMonitorDataType data.</p>
     */
    @NameInMap("MonitorData")
    public DescribeInstanceMonitorDataResponseBodyMonitorData monitorData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
     */
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
        /**
         * <p>The vCPU usage of the instance, which is raw data. For example, a value of 0.02 indicates that the usage is 2%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>yourInstance ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is not yet supported.</p>
         */
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
