// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropPacketResponseBody extends TeaModel {
    /**
     * <p>The list of dropped packets in the instance.</p>
     */
    @NameInMap("InstanceDropPacket")
    public DescribeInstanceDropPacketResponseBodyInstanceDropPacket instanceDropPacket;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceDropPacketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropPacketResponseBody self = new DescribeInstanceDropPacketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropPacketResponseBody setInstanceDropPacket(DescribeInstanceDropPacketResponseBodyInstanceDropPacket instanceDropPacket) {
        this.instanceDropPacket = instanceDropPacket;
        return this;
    }
    public DescribeInstanceDropPacketResponseBodyInstanceDropPacket getInstanceDropPacket() {
        return this.instanceDropPacket;
    }

    public DescribeInstanceDropPacketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem extends TeaModel {
        /**
         * <p>The metric. Valid values:</p>
         * <br>
         * <p>*   InstanceDropPacketRX: the number of inbound packets dropped in the instance per second.</p>
         * <p>*   InstanceDropPacketTX: the number of outbound packets dropped in the instance per second.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of dropped packets in the instance.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem self = new DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstanceDropPacketResponseBodyInstanceDropPacket extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem> monitorItem;

        public static DescribeInstanceDropPacketResponseBodyInstanceDropPacket build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDropPacketResponseBodyInstanceDropPacket self = new DescribeInstanceDropPacketResponseBodyInstanceDropPacket();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDropPacketResponseBodyInstanceDropPacket setMonitorItem(java.util.List<DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceDropPacketResponseBodyInstanceDropPacketMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
