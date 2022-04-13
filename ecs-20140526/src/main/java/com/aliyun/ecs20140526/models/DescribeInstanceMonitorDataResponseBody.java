// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    public DescribeInstanceMonitorDataResponseBodyMonitorData monitorData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMonitorDataResponseBody self = new DescribeInstanceMonitorDataResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("BPSRead")
        public Integer BPSRead;

        @NameInMap("BPSWrite")
        public Integer BPSWrite;

        @NameInMap("CPU")
        public Integer CPU;

        @NameInMap("CPUAdvanceCreditBalance")
        public Float CPUAdvanceCreditBalance;

        @NameInMap("CPUCreditBalance")
        public Float CPUCreditBalance;

        @NameInMap("CPUCreditUsage")
        public Float CPUCreditUsage;

        @NameInMap("CPUNotpaidSurplusCreditUsage")
        public Float CPUNotpaidSurplusCreditUsage;

        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetBandwidth")
        public Integer internetBandwidth;

        @NameInMap("InternetRX")
        public Integer internetRX;

        @NameInMap("InternetTX")
        public Integer internetTX;

        @NameInMap("IntranetBandwidth")
        public Integer intranetBandwidth;

        @NameInMap("IntranetRX")
        public Integer intranetRX;

        @NameInMap("IntranetTX")
        public Integer intranetTX;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData self = new DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setBPSRead(Integer BPSRead) {
            this.BPSRead = BPSRead;
            return this;
        }
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setBPSWrite(Integer BPSWrite) {
            this.BPSWrite = BPSWrite;
            return this;
        }
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPUAdvanceCreditBalance(Float CPUAdvanceCreditBalance) {
            this.CPUAdvanceCreditBalance = CPUAdvanceCreditBalance;
            return this;
        }
        public Float getCPUAdvanceCreditBalance() {
            return this.CPUAdvanceCreditBalance;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPUCreditBalance(Float CPUCreditBalance) {
            this.CPUCreditBalance = CPUCreditBalance;
            return this;
        }
        public Float getCPUCreditBalance() {
            return this.CPUCreditBalance;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPUCreditUsage(Float CPUCreditUsage) {
            this.CPUCreditUsage = CPUCreditUsage;
            return this;
        }
        public Float getCPUCreditUsage() {
            return this.CPUCreditUsage;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setCPUNotpaidSurplusCreditUsage(Float CPUNotpaidSurplusCreditUsage) {
            this.CPUNotpaidSurplusCreditUsage = CPUNotpaidSurplusCreditUsage;
            return this;
        }
        public Float getCPUNotpaidSurplusCreditUsage() {
            return this.CPUNotpaidSurplusCreditUsage;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setInternetBandwidth(Integer internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }
        public Integer getInternetBandwidth() {
            return this.internetBandwidth;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setInternetRX(Integer internetRX) {
            this.internetRX = internetRX;
            return this;
        }
        public Integer getInternetRX() {
            return this.internetRX;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setInternetTX(Integer internetTX) {
            this.internetTX = internetTX;
            return this;
        }
        public Integer getInternetTX() {
            return this.internetTX;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setIntranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }
        public Integer getIntranetBandwidth() {
            return this.intranetBandwidth;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setIntranetRX(Integer intranetRX) {
            this.intranetRX = intranetRX;
            return this;
        }
        public Integer getIntranetRX() {
            return this.intranetRX;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setIntranetTX(Integer intranetTX) {
            this.intranetTX = intranetTX;
            return this;
        }
        public Integer getIntranetTX() {
            return this.intranetTX;
        }

        public DescribeInstanceMonitorDataResponseBodyMonitorDataInstanceMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
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
