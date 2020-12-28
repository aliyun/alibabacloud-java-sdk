// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorData")
    public java.util.List<DescribeEniMonitorDataResponseBodyMonitorData> monitorData;

    public static DescribeEniMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataResponseBody self = new DescribeEniMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEniMonitorDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEniMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEniMonitorDataResponseBody setMonitorData(java.util.List<DescribeEniMonitorDataResponseBodyMonitorData> monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public java.util.List<DescribeEniMonitorDataResponseBodyMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeEniMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("PacketRx")
        public String packetRx;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("DropPacketRx")
        public String dropPacketRx;

        @NameInMap("EniId")
        public String eniId;

        @NameInMap("DropPacketTx")
        public String dropPacketTx;

        @NameInMap("PacketTx")
        public String packetTx;

        @NameInMap("IntranetTx")
        public String intranetTx;

        @NameInMap("IntranetRx")
        public String intranetRx;

        public static DescribeEniMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseBodyMonitorData self = new DescribeEniMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setPacketRx(String packetRx) {
            this.packetRx = packetRx;
            return this;
        }
        public String getPacketRx() {
            return this.packetRx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setDropPacketRx(String dropPacketRx) {
            this.dropPacketRx = dropPacketRx;
            return this;
        }
        public String getDropPacketRx() {
            return this.dropPacketRx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setDropPacketTx(String dropPacketTx) {
            this.dropPacketTx = dropPacketTx;
            return this;
        }
        public String getDropPacketTx() {
            return this.dropPacketTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setPacketTx(String packetTx) {
            this.packetTx = packetTx;
            return this;
        }
        public String getPacketTx() {
            return this.packetTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setIntranetTx(String intranetTx) {
            this.intranetTx = intranetTx;
            return this;
        }
        public String getIntranetTx() {
            return this.intranetTx;
        }

        public DescribeEniMonitorDataResponseBodyMonitorData setIntranetRx(String intranetRx) {
            this.intranetRx = intranetRx;
            return this;
        }
        public String getIntranetRx() {
            return this.intranetRx;
        }

    }

}
