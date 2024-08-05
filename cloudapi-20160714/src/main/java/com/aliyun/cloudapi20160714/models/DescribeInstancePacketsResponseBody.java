// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancePacketsResponseBody extends TeaModel {
    /**
     * <p>The list of inbound and outbound data packets in the instance.</p>
     */
    @NameInMap("InstancePackets")
    public DescribeInstancePacketsResponseBodyInstancePackets instancePackets;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstancePacketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePacketsResponseBody self = new DescribeInstancePacketsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePacketsResponseBody setInstancePackets(DescribeInstancePacketsResponseBodyInstancePackets instancePackets) {
        this.instancePackets = instancePackets;
        return this;
    }
    public DescribeInstancePacketsResponseBodyInstancePackets getInstancePackets() {
        return this.instancePackets;
    }

    public DescribeInstancePacketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem extends TeaModel {
        /**
         * <p>The metric. Valid values:</p>
         * <ul>
         * <li>InstancePacketRX: inbound data packets</li>
         * <li>InstancePacketTX: outbound data packets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstancePacketRX</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-24T10:14:53Z</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of inbound and outbound data packets in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem self = new DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstancePacketsResponseBodyInstancePackets extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> monitorItem;

        public static DescribeInstancePacketsResponseBodyInstancePackets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePacketsResponseBodyInstancePackets self = new DescribeInstancePacketsResponseBodyInstancePackets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePacketsResponseBodyInstancePackets setMonitorItem(java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
