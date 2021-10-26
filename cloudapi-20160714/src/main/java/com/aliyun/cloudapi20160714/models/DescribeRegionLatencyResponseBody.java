// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionLatencyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LatencyPacket")
    public DescribeRegionLatencyResponseBodyLatencyPacket latencyPacket;

    public static DescribeRegionLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionLatencyResponseBody self = new DescribeRegionLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionLatencyResponseBody setLatencyPacket(DescribeRegionLatencyResponseBodyLatencyPacket latencyPacket) {
        this.latencyPacket = latencyPacket;
        return this;
    }
    public DescribeRegionLatencyResponseBodyLatencyPacket getLatencyPacket() {
        return this.latencyPacket;
    }

    public static class DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("Item")
        public String item;

        public static DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem self = new DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class DescribeRegionLatencyResponseBodyLatencyPacket extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem> monitorItem;

        public static DescribeRegionLatencyResponseBodyLatencyPacket build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionLatencyResponseBodyLatencyPacket self = new DescribeRegionLatencyResponseBodyLatencyPacket();
            return TeaModel.build(map, self);
        }

        public DescribeRegionLatencyResponseBodyLatencyPacket setMonitorItem(java.util.List<DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeRegionLatencyResponseBodyLatencyPacketMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
