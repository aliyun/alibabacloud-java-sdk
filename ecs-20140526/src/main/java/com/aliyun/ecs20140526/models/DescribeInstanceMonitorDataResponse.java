// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

        @NameInMap("CPU")
        @Validation(required = true)
        public Integer CPU;

        @NameInMap("IntranetRX")
        @Validation(required = true)
        public Integer intranetRX;

        @NameInMap("IntranetTX")
        @Validation(required = true)
        public Integer intranetTX;

        @NameInMap("IntranetBandwidth")
        @Validation(required = true)
        public Integer intranetBandwidth;

        @NameInMap("InternetRX")
        @Validation(required = true)
        public Integer internetRX;

        @NameInMap("InternetTX")
        @Validation(required = true)
        public Integer internetTX;

        @NameInMap("InternetBandwidth")
        @Validation(required = true)
        public Integer internetBandwidth;

        @NameInMap("IOPSRead")
        @Validation(required = true)
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        @Validation(required = true)
        public Integer IOPSWrite;

        @NameInMap("BPSRead")
        @Validation(required = true)
        public Integer BPSRead;

        @NameInMap("BPSWrite")
        @Validation(required = true)
        public Integer BPSWrite;

        @NameInMap("CPUCreditUsage")
        @Validation(required = true)
        public Float CPUCreditUsage;

        @NameInMap("CPUCreditBalance")
        @Validation(required = true)
        public Float CPUCreditBalance;

        @NameInMap("CPUAdvanceCreditBalance")
        @Validation(required = true)
        public Float CPUAdvanceCreditBalance;

        @NameInMap("CPUNotpaidSurplusCreditUsage")
        @Validation(required = true)
        public Float CPUNotpaidSurplusCreditUsage;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

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

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setIntranetRX(Integer intranetRX) {
            this.intranetRX = intranetRX;
            return this;
        }
        public Integer getIntranetRX() {
            return this.intranetRX;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setIntranetTX(Integer intranetTX) {
            this.intranetTX = intranetTX;
            return this;
        }
        public Integer getIntranetTX() {
            return this.intranetTX;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setIntranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }
        public Integer getIntranetBandwidth() {
            return this.intranetBandwidth;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setInternetRX(Integer internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Integer getInternetRX() {
            return this.internetRX;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setInternetTX(Integer internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Integer getInternetTX() {
            return this.internetTX;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setInternetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setBPSRead(Integer BPSRead) {
            this.BPSRead = BPSRead;
            return this;
        }
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setBPSWrite(Integer BPSWrite) {
            this.BPSWrite = BPSWrite;
            return this;
        }
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPUCreditUsage(Float CPUCreditUsage) {
            this.CPUCreditUsage = CPUCreditUsage;
            return this;
        }
        public Float getCPUCreditUsage() {
            return this.CPUCreditUsage;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPUCreditBalance(Float CPUCreditBalance) {
            this.CPUCreditBalance = CPUCreditBalance;
            return this;
        }
        public Float getCPUCreditBalance() {
            return this.CPUCreditBalance;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPUAdvanceCreditBalance(Float CPUAdvanceCreditBalance) {
            this.CPUAdvanceCreditBalance = CPUAdvanceCreditBalance;
            return this;
        }
        public Float getCPUAdvanceCreditBalance() {
            return this.CPUAdvanceCreditBalance;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setCPUNotpaidSurplusCreditUsage(Float CPUNotpaidSurplusCreditUsage) {
            this.CPUNotpaidSurplusCreditUsage = CPUNotpaidSurplusCreditUsage;
            return this;
        }
        public Float getCPUNotpaidSurplusCreditUsage() {
            return this.CPUNotpaidSurplusCreditUsage;
        }

        public DescribeInstanceMonitorDataResponseMonitorDataInstanceMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
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
