// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The details about the monitoring data of the secondary ENI.</p>
     */
    @NameInMap("MonitorData")
    public DescribeEniMonitorDataResponseBodyMonitorData monitorData;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEniMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataResponseBody self = new DescribeEniMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEniMonitorDataResponseBody setMonitorData(DescribeEniMonitorDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeEniMonitorDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeEniMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEniMonitorDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData extends TeaModel {
        /**
         * <p>The number of dropped packets received by the secondary ENI over the internal network.</p>
         */
        @NameInMap("DropPacketRx")
        public String dropPacketRx;

        /**
         * <p>The number of dropped packets sent by the secondary ENI over the internal network.</p>
         */
        @NameInMap("DropPacketTx")
        public String dropPacketTx;

        /**
         * <p>The secondary ENI ID.</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The average rate of data received by the secondary ENI over the internal network. Unit: Kbit/s.</p>
         */
        @NameInMap("IntranetRx")
        public String intranetRx;

        /**
         * <p>The average rate of data sent by the secondary ENI over the internal network. Unit: Kbit/s.</p>
         */
        @NameInMap("IntranetTx")
        public String intranetTx;

        /**
         * <p>The number of packets received by the secondary ENI over the internal network.</p>
         */
        @NameInMap("PacketRx")
        public String packetRx;

        /**
         * <p>The number of packets sent by the secondary ENI over the internal network.</p>
         */
        @NameInMap("PacketTx")
        public String packetTx;

        /**
         * <p>The timestamp to query the monitoring data. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData self = new DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setDropPacketRx(String dropPacketRx) {
            this.dropPacketRx = dropPacketRx;
            return this;
        }
        public String getDropPacketRx() {
            return this.dropPacketRx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setDropPacketTx(String dropPacketTx) {
            this.dropPacketTx = dropPacketTx;
            return this;
        }
        public String getDropPacketTx() {
            return this.dropPacketTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setIntranetRx(String intranetRx) {
            this.intranetRx = intranetRx;
            return this;
        }
        public String getIntranetRx() {
            return this.intranetRx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setIntranetTx(String intranetTx) {
            this.intranetTx = intranetTx;
            return this;
        }
        public String getIntranetTx() {
            return this.intranetTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setPacketRx(String packetRx) {
            this.packetRx = packetRx;
            return this;
        }
        public String getPacketRx() {
            return this.packetRx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setPacketTx(String packetTx) {
            this.packetTx = packetTx;
            return this;
        }
        public String getPacketTx() {
            return this.packetTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeEniMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("EniMonitorData")
        public java.util.List<DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData> eniMonitorData;

        public static DescribeEniMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseBodyMonitorData self = new DescribeEniMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setEniMonitorData(java.util.List<DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData> eniMonitorData) {
            this.eniMonitorData = eniMonitorData;
            return this;
        }
        public java.util.List<DescribeEniMonitorDataResponseBodyMonitorDataEniMonitorData> getEniMonitorData() {
            return this.eniMonitorData;
        }

    }

}
