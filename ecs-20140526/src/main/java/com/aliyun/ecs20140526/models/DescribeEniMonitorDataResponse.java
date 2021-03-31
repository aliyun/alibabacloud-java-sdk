// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEniMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeEniMonitorDataResponseMonitorData monitorData;

    public static DescribeEniMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniMonitorDataResponse self = new DescribeEniMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEniMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEniMonitorDataResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEniMonitorDataResponse setMonitorData(DescribeEniMonitorDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeEniMonitorDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeEniMonitorDataResponseMonitorDataEniMonitorData extends TeaModel {
        @NameInMap("EniId")
        @Validation(required = true)
        public String eniId;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("PacketTx")
        @Validation(required = true)
        public String packetTx;

        @NameInMap("PacketRx")
        @Validation(required = true)
        public String packetRx;

        @NameInMap("IntranetTx")
        @Validation(required = true)
        public String intranetTx;

        @NameInMap("IntranetRx")
        @Validation(required = true)
        public String intranetRx;

        @NameInMap("DropPacketTx")
        @Validation(required = true)
        public String dropPacketTx;

        @NameInMap("DropPacketRx")
        @Validation(required = true)
        public String dropPacketRx;

        public static DescribeEniMonitorDataResponseMonitorDataEniMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseMonitorDataEniMonitorData self = new DescribeEniMonitorDataResponseMonitorDataEniMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setPacketTx(String packetTx) {
            this.packetTx = packetTx;
            return this;
        }
        public String getPacketTx() {
            return this.packetTx;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setPacketRx(String packetRx) {
            this.packetRx = packetRx;
            return this;
        }
        public String getPacketRx() {
            return this.packetRx;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setIntranetTx(String intranetTx) {
            this.intranetTx = intranetTx;
            return this;
        }
        public String getIntranetTx() {
            return this.intranetTx;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setIntranetRx(String intranetRx) {
            this.intranetRx = intranetRx;
            return this;
        }
        public String getIntranetRx() {
            return this.intranetRx;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setDropPacketTx(String dropPacketTx) {
            this.dropPacketTx = dropPacketTx;
            return this;
        }
        public String getDropPacketTx() {
            return this.dropPacketTx;
        }

        public DescribeEniMonitorDataResponseMonitorDataEniMonitorData setDropPacketRx(String dropPacketRx) {
            this.dropPacketRx = dropPacketRx;
            return this;
        }
        public String getDropPacketRx() {
            return this.dropPacketRx;
        }

    }

    public static class DescribeEniMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("EniMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeEniMonitorDataResponseMonitorDataEniMonitorData> eniMonitorData;

        public static DescribeEniMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEniMonitorDataResponseMonitorData self = new DescribeEniMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeEniMonitorDataResponseMonitorData setEniMonitorData(java.util.List<DescribeEniMonitorDataResponseMonitorDataEniMonitorData> eniMonitorData) {
            this.eniMonitorData = eniMonitorData;
            return this;
        }
        public java.util.List<DescribeEniMonitorDataResponseMonitorDataEniMonitorData> getEniMonitorData() {
            return this.eniMonitorData;
        }

    }

}
