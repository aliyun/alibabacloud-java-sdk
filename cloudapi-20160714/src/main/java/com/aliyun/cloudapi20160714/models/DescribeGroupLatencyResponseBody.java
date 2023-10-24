// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupLatencyResponseBody extends TeaModel {
    @NameInMap("LatencyPacket")
    public DescribeGroupLatencyResponseBodyLatencyPacket latencyPacket;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupLatencyResponseBody self = new DescribeGroupLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupLatencyResponseBody setLatencyPacket(DescribeGroupLatencyResponseBodyLatencyPacket latencyPacket) {
        this.latencyPacket = latencyPacket;
        return this;
    }
    public DescribeGroupLatencyResponseBodyLatencyPacket getLatencyPacket() {
        return this.latencyPacket;
    }

    public DescribeGroupLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem self = new DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeGroupLatencyResponseBodyLatencyPacket extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem> monitorItem;

        public static DescribeGroupLatencyResponseBodyLatencyPacket build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupLatencyResponseBodyLatencyPacket self = new DescribeGroupLatencyResponseBodyLatencyPacket();
            return TeaModel.build(map, self);
        }

        public DescribeGroupLatencyResponseBodyLatencyPacket setMonitorItem(java.util.List<DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeGroupLatencyResponseBodyLatencyPacketMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
