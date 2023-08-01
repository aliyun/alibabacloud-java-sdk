// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data of the instance.</p>
     */
    @NameInMap("MonitorData")
    public DescribeInstanceMonitorDataResponseBodyMonitorData monitorData;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The read bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.</p>
         */
        @NameInMap("BPSRead")
        public Integer BPSRead;

        /**
         * <p>The write bandwidth of the cloud disks (system disk and data disks). Unit: Byte/s.</p>
         */
        @NameInMap("BPSWrite")
        public Integer BPSWrite;

        /**
         * <p>The vCPU utilization of the instance. Unit: percent (%).</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>The overdrawn CPU credits of the burstable instance.</p>
         */
        @NameInMap("CPUAdvanceCreditBalance")
        public Float CPUAdvanceCreditBalance;

        /**
         * <p>The total number of CPU credits of the burstable instance.</p>
         */
        @NameInMap("CPUCreditBalance")
        public Float CPUCreditBalance;

        /**
         * <p>The number of CPU credits consumed by the burstable instance.</p>
         */
        @NameInMap("CPUCreditUsage")
        public Float CPUCreditUsage;

        /**
         * <p>The unpaid overdrawn CPU credits.</p>
         */
        @NameInMap("CPUNotpaidSurplusCreditUsage")
        public Float CPUNotpaidSurplusCreditUsage;

        /**
         * <p>The number of read I/O operations per second on the cloud disks (system disk and data disks).</p>
         */
        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        /**
         * <p>The number of write I/O operations per second on the cloud disks (system disk and data disks).</p>
         */
        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The public bandwidth of the instance. Unit: Kbit/s.</p>
         */
        @NameInMap("InternetBandwidth")
        public Integer internetBandwidth;

        /**
         * <p>The Internet traffic received by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.</p>
         */
        @NameInMap("InternetRX")
        public Integer internetRX;

        /**
         * <p>The Internet traffic sent by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.</p>
         */
        @NameInMap("InternetTX")
        public Integer internetTX;

        /**
         * <p>The internal bandwidth of the instance. Unit: Kbit/s.</p>
         */
        @NameInMap("IntranetBandwidth")
        public Integer intranetBandwidth;

        /**
         * <p>The internal data traffic received by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.</p>
         */
        @NameInMap("IntranetRX")
        public Integer intranetRX;

        /**
         * <p>The internal data traffic sent by the instance during the period that is specified by the `Period` parameter. The period starts from the point in time that is specified by the `TimeStamp` parameter. Unit: Kbit.</p>
         */
        @NameInMap("IntranetTX")
        public Integer intranetTX;

        /**
         * <p>The timestamp of the monitoring data.</p>
         */
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
