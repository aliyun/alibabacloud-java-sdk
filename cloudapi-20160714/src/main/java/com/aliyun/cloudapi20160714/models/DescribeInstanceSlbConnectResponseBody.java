// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceSlbConnectResponseBody extends TeaModel {
    /**
     * <p>The list of concurrent connections in the instance.</p>
     */
    @NameInMap("InstanceSlbConnect")
    public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect instanceSlbConnect;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceSlbConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSlbConnectResponseBody self = new DescribeInstanceSlbConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSlbConnectResponseBody setInstanceSlbConnect(DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect instanceSlbConnect) {
        this.instanceSlbConnect = instanceSlbConnect;
        return this;
    }
    public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect getInstanceSlbConnect() {
        return this.instanceSlbConnect;
    }

    public DescribeInstanceSlbConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem extends TeaModel {
        /**
         * <p>The metric. Valid values:</p>
         * <br>
         * <p>*   InstanceMaxConnection: the maximum number of connections</p>
         * <p>*   InstanceInactiveConnection: the number of inactive connections</p>
         * <p>*   InstanceActiveConnection: the number of active connections</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of concurrent connections in the instance.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem self = new DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> monitorItem;

        public static DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect self = new DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect setMonitorItem(java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
